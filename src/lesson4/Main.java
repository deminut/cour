package lesson4;

import lesson4.entitty.Country;
import lesson4.entitty.Person;
import lesson4.entitty.Sex;
import lesson4.entitty.Worker;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Pablo", 23, Sex.MALE);
        Person person2 = new Person("Anna", 20, Sex.FEMALE);

        person1.setCountry(new Country("Brazil", 222223));
        person2.setCountry(person1.getCountry());

        System.out.println(person1);
        System.out.println(person2);

        Worker worker1 = new Worker("Mufasa", 45, Sex.MALE);
        worker1.toWork();
    }
}
