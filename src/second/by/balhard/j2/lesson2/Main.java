package second.by.balhard.j2.lesson2;

public class Main {

    public static void main(String[] args) {
        int x=22;
        /*if (x==20)
        {x--;}
        else if (x==21)
        {x++;}
        else
        {x/=2;}

        int y = x%2==0 ? x++ : x-- ;
        System.out.println(x + " y");
        x = x%2==0 ? x++ : x-- ;
        System.out.println(x + " x");
*//*
        int d=0;
        int y=0;
        while (x<240)
        {
            y=x+x/4;
            d++;
        }*/
        /*
        System.out.println(x + " k=" + k);
        x=22;
        int g=0;
        do
        {
            x=x+x/4;
            g++;
        } while (x<240);
        System.out.println(x + " g=" + g);
        */
        for (int d = 0; d<4;d++)
        {
            x+=d;
        }
        System.out.println(x);

    }
}
