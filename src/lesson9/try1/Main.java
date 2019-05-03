package lesson9.try1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();

        list.add(new Car("opel",1000));
        list.add(new Car("audi",1000));
        list.add(new Car("opel",1030));
        list.add(new Car("opel",1040));
        list.add(new Car("opel",1050));
        list.add(new Car("audi",1030));
        list.add(new Car("adudi",1020));
        list.add(new Car("audi",104440));
        list.add(new Car("adudi",100000));


        Comparator<Car> comparatorCAr = (o1, o2) -> {
            int dDistance = o1.getDistance()-o2.getDistance();
            if (dDistance==0){
             return o1.getName().compareTo(o2.getName());
            }
            return dDistance;
        };

//        list.forEach(System.out::println);

        List<Car> collect = list.stream().filter(a -> a.getDistance()<5000).sorted(comparatorCAr).collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
