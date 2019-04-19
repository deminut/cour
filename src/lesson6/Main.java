package lesson6;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("один");
//        list.add("два");
//        list.add("три");
//        list.add(1,"четыре");
//        boolean containts = list.contains("два");
//        list.set(3,"Five");
//        list.remove(1);
//
//        System.out.println(list);
//        System.out.println(list.size() + " " + list.isEmpty());
//        System.out.println(containts);

/*        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("the");
        set.add("the");
        set.add("The");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals("two"))
                iterator.remove();
        }

        for (String s: set) {
            System.out.println(s+" "+s);
        }

        System.out.println(set);*/

        Map<String, Car> map = new HashMap<>();

        //create
        map.put("Audi", new Car("Audi"));
        map.put("opel", new Car("Opel corsa"));
        map.put("zaz", new Car("Mersedes"));

        //read
        Car audi = map.get("Audi");
        Car vaz = map.get("Vaz");

        //update
        map.put("zaz", new Car("zaporojets"));

        //delete
        Car zaz = map.remove("zaz");
        map.remove("zaz",new Car("opl12"));

        System.out.println(audi);
        System.out.println(vaz);



    }
}
