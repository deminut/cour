package lesson5;

public class Main {
    public static void main(String[] args) {
//        Worker worker = new Worker();
//        worker.example();
//
//        Person person1 = new Person();
//        person1.doWork();
//        worker.doWork();

        Person person2 = new Worker();
        Person person1 = new Person();
        Worker worker = new Worker();
        person2.doWork();
        person1.doWork();
        worker.doWork();
        System.out.println(person2.a);
        System.out.println(person1.a);
        System.out.println(worker.a);

//        System.out.println(person1 instanceof Person);
//        System.out.println(person2 instanceof Person);
//        System.out.println(worker instanceof Person);
//        System.out.println();
//        System.out.println(person1 instanceof  Worker);
//        System.out.println(person2 instanceof  Worker);
//        System.out.println(worker instanceof  Worker);
//        System.out.println();
//        System.out.println(person1 instanceof  Worker);
//        System.out.println(person1 instanceof  Worker);
//        System.out.println(worker instanceof Worker);
    }
}
