package Day23_Java_Methods;

import java.sql.SQLOutput;

public class JavaMethods4 {

   /* public static int total (int x, int y)
    {
        return x+y;
    }

    public static int total(int x, int y, int z)
    {
        return x+y+z;
    }
    */

    // '...' 3 noktanin anlami; istedigimiz kadar degsiken gonderebiliriz.

    public static int total(int... numbers)
    {
        int total = 0;
        for (int i = 0; i < numbers.length; i++)
        {
        total+=numbers[i];
        }

        return total;
    }

    public static double total(double... numbers)
    {
        double total = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            total+=numbers[i];
        }

        return total;
    }

    public static void main(String[] args) {

        int n1=4;
        int n2=56;
        int n3=78;
        int n4=54;

        double d1 = 5.5;
        double d2 = 3.4;
        double d3 = 4.4;


        int result1 = total(n1,n2);
        int result2 = total(n1,n2,n3);
        int result3 = total(n1,n2,n3,n4);

        System.out.println(result3);
        System.out.println(total(2.35, 3.41, 5.19));
        System.out.println(total(d1,d2,d3));

    }
}
