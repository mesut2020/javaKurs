package Day13_IfElse;

import java.util.Scanner;

public class GununSorusu {
    public static void main(String[] args){
    // Girilen bir ay numarasina gore, ayin kac gun oldugunu yazdiriniz.

        Scanner sc = new Scanner(System.in);
        System.out.print("Kacinci ay, giriniz =");
        int m = sc.nextInt();

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31"); break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30"); break;
            case 2:
                System.out.println("yil =");
                int y = sc.nextInt();
                if(y%4==0)
                    System.out.println("29");
                else
                    System.out.println("28");

        }


    }

}
