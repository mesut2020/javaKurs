package Day22_Java_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethods4 {

    public static  void maxNum(int[] arr)
    {
        Arrays.sort(arr);
        System.out.println("Maximum = " + arr[arr.length-1]);
    }

    public static  void minNum(int[] arr)
    {
        Arrays.sort(arr);
        System.out.println("Minimum = " + arr[0]);
    }

    public static  void totalAll(int[] arr)
    {
        int total = 0;
        for (int i = 0; i < arr.length; i++)
        {
            total+= arr[i];
        }
        System.out.println("total = " + total);
    }

    public static  void aveAll(int[] arr)
    {
        double total = 0;
        for (int i = 0; i < arr.length; i++)
        {
            total+= arr[i];
        }
        System.out.println("Average = " + total/arr.length);
    }



    public static void main(String[] args) {
        // string seklinde aralarinda bosluklarla girilen bir dizini
        //  maksimum, minimum, total, average
        //  ayri ayri methodlarda yaziniz...
        //  3 5 77 89 34 56 33 gibi girs yapilack...

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter numbers with space...");

        String strAllNum= sc.nextLine();

        String[] strArr = strAllNum.split(" ");
        int[] numArr= new int[strArr.length];

        for (int i = 0; i < strArr.length; i++)
        {
            numArr[i]= Integer.parseInt(strArr[i]); // string diziyi int diziye donusturur...
        }
        System.out.println(Arrays.toString(numArr));

        maxNum(numArr);
        minNum(numArr);
        totalAll(numArr);
        aveAll(numArr);


    }
}
