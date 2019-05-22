package lesson11;

import java.sql.*;
import java.util.stream.Stream;

public class Main {

        private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
        private static final String USER = "root";
        private static final String PASSWORD = "root";
        private static final String URL = "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";

    public static void main(String[] args) {

        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e){
            System.err.println(DRIVER_NAME+" loading failure");
            return;
        }

        Connection connection;

        try{
            connection = DriverManager.getConnection(URL,USER,PASSWORD);

            Statement statement = connection.createStatement();
//            statement.execute("insert into employees values (null,'Bruce',null,150,current_date )");
//            int result = statement.executeUpdate("delete from employees where name = 'Bruce'");
//            System.out.println(result);
            String query = "select * from employees e join specialties s on (e.specialty_id = s.id);";

            ResultSet resultSet = statement.executeQuery(query);

             while(resultSet.next()){
                 int id = resultSet.getInt("e.id");
                 String name = resultSet.getString("e.name");
                 String specialty = resultSet.getString("specialty");
                 int salary = resultSet.getInt("salary");
                 java.util.Date date = resultSet.getDate("date_of_employment");
                 System.out.printf("%-2d) %-10s %-10s %5d  %5$td/%5$tm/%5$tY\n", id, name, specialty, salary, date);
             }

//             query = "update employees set (salary = salary+?) where salary < ?;";
             PreparedStatement preparedStatement = connection
                     .prepareStatement("update employees set salary = salary+? where salary < ?;");

             int delta=100;
             int bound = 1000;
             preparedStatement.setInt(1, delta);
             preparedStatement.setInt(2, bound);
             preparedStatement.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }



    }
}
