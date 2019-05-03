package lesson9.les1;

public class Main {
    public static void main(String[] args) {
        try {
            throwFirst();
            throwSecond();
        } catch (Exception2 exc) {
            System.out.println("exc1");
        } catch (Excaeption1 e){
            System.out.println("e");
        } catch (RuntimeException e){
            System.out.println("runtime");
        } catch (Exception e) {
            System.out.println("exception");
        }

    }


    public static void throwFirst() {
        throw new Excaeption1();
    }

    public static void throwSecond() {
        throw new Exception2();
    }
}