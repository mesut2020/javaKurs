package Day15_Proje1;

import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {

    /*
     Girilen 2 sayı arasında Random integer sayı üreten programı yazınız.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int min = sc.nextInt();

        int uSayi = (int) (Math.random() * ((max-min)+1)) + min;

        System.out.println(uSayi);
    }
}




