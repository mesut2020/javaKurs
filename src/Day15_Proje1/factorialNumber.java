package Day15_Proje1;

import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        /*
        Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720

         */


         //      kodu burdan başlatın

        Scanner sc = new Scanner(System.in);

        int sayi = sc.nextInt();
        int carpim = 1;

        while (sayi>0){
            carpim = sayi*carpim;

            sayi--;

        }
        System.out.println(carpim);


    }
}
