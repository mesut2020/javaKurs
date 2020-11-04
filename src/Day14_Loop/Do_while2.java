package Day14_Loop;

import java.util.Scanner;

public class Do_while2 {
    public static void main(String[] args) {
        //Kullanici x harfi girilene kadar "program calisiyor" yazan
        //ve x girildiginde "program" bitti yaziniz.

        Scanner sc = new Scanner(System.in);

        String harf="";
        do {

            harf = sc.nextLine();
            if (harf.equalsIgnoreCase("x")) break; // break; dongu kirici.

            System.out.println("Program calisiyor...");

        }while (!harf.equalsIgnoreCase("x"));

        System.out.println("Program bitti...");
    }
}
