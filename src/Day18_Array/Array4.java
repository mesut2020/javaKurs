package Day18_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        // Kullanicidan alalcaginiz 5 sayiyi bir diziye atadiktan sonra
        // ayri bir dongu ile kac tanesinin tek sayi oldugunu bulunuz...

        Scanner sc = new Scanner((System.in));
        int[] num = new int[7];
        int a=0;


        for(int i=0; i< num.length; i++)
            num[i]=sc.nextInt();

        System.out.println(Arrays.toString(num)); // girilen diziyi yazar... [1, 2, 3, 4, 5, 6, 7]

        for(int i=0; i< num.length; i++)
            if (num[i]%2==1)
                a++;

        System.out.println(a);
    }
}
