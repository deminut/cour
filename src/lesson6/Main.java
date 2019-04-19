package lesson6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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

        Set<String> set = new HashSet<>();
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

        System.out.println(set);
    }
}
