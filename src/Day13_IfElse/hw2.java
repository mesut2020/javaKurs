package Day13_IfElse;

import java.util.Scanner;

public class hw2 {
    public static void main (String[] args) {
        //2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner sc = new Scanner (System.in);
        System.out.println("Uc basamakli bir sayi giriniz...: ");
        int num = sc.nextInt();
        int yuz = num/100;
        int on =  (num/10)%10;
        int bir = num%10;
        String y="";
        String o= "";
        String b="";

        switch (bir) {
            case 1:b="bir";break;
            case 2:b="iki";break;
            case 3:b="uc";break;
            case 4:b="dort";break;
            case 5: b="bes";break;
            case 6: b="altı";break;
            case 7: b="yedi";break;
            case 8: b="sekiz";break;
            case 9:b="dokuz";break;
            //case 0:b="";break;
        }

        switch (on) {
            case 1:o="on ";break;
            case 2:o="yirmi ";break;
            case 3:o="otuz ";break;
            case 4:o="kirk ";break;
            case 5: o="elli ";break;
            case 6: o="altmis ";break;
            case 7: o="yetmis ";break;
            case 8: o="seksen ";break;
            case 9:o="doksan ";break;
            //case 0:o="";break;
        }

        switch (yuz) {
            case 1:y="";break;
            case 2:y="iki ";break;
            case 3:y="uc ";break;
            case 4:y="dort ";break;
            case 5: y="bes ";break;
            case 6: y="altı ";break;
            case 7: y="yedi ";break;
            case 8: y="sekiz ";break;
            case 9:y="dokuz ";break;
        }

        String numYazi = y + "yuz " + o +" "+ b;
        numYazi = numYazi.replaceAll(" {2,}", " "); // Birden fazla olan bosluklari bir bosluk yapiyor...

        System.out.println(numYazi);

    }

}
