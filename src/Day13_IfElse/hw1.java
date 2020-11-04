package Day13_IfElse;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        //Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.println("Bugunu giriniz: ");
        String day = sc.nextLine();
        int d=0;
        switch (day) {

            case "Montag": d=1; break;
            case "Dienstag": d=2; break;
            case "MIttwoch": d=3; break;
            case "Donnerstag": d=4; break;
            case "Freitag": d=5; break;
            case "Samstag": d=6; break;
            case "Sonntag": d=7; break;
            default:
                System.out.println("Gunu yanlis girdiniz...");
        }
        if (d!=0) {
            d = (d + 100 % 7) % 7;
            switch (d) {
                case 1: System.out.println("Montag");break;
                case 2: System.out.println("Dienstag");break;
                case 3: System.out.println("Mittwoch"); break;
                case 4: System.out.println("Donnerstag"); break;
                case 5: System.out.println("Freitag"); break;
                case 6: System.out.println("Samstag"); break;
                case 0: System.out.println("Sonntag"); break;
            }
        }

    }
}
