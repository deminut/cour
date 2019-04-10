package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int testArray[][]=new int[4][5];
//        Scanner in = new Scanner(System.in);
//        int x = 0;
//        for (int i=0;i<4;i++)
//            for(int k=0; k<5;k++) {
//                x = in.nextInt();
//                testArray[i][k] = x;
//            }
//
//        for (int i=0;i<4;i++) {
//            for (int k = 0; k < 5; k++) {
//                System.out.print(testArray[i][k] + " ");
//            }
//            System.out.println();
//        }
        String[][] array = new String[3][];
        array[0]= new String[3];
        array[1]= new String[2];
        array[2]= new String[1];

        for (String[] ar :array) {
            for (String s: ar){
                s="a";
                System.out.printf("%3s",s);
            }
            System.out.println();
        }
    }
}
