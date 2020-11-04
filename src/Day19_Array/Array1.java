package Day19_Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        // Lullanicidan alacaginiz 5 adet sayiyi giris sirasina gore tersten yazdirin...

        Scanner sc = new Scanner((System.in));
        int[] num = new int[5];


        for(int i=0; i<num.length; i++) // i: 0 1 2 3 4
            num[i]=sc.nextInt();

        for(int i=num.length-1; i>=0; i--) // i: 4 3 2 1 0
            System.out.println(num[i]);

    }
}
