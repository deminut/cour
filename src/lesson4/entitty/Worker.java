package lesson4.entitty;

public class Worker extends Person {

    private int salary;
    public Worker(String name, int age, Sex sex) {
        super(name, age, sex);
    }

    @Override
    public void toWork() {
        System.out.println("Я работаю рабочим ");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
