package lesson5;

public class Worker extends Person {

    public int a=5;
//    public void example() {
//        System.out.println(this.a+" " + super.a);
//    }

    @Override
    public void doWork() {
//        int a = 5;
//        super.doWork();
        System.out.println("Can Work" + a);
    }
}
