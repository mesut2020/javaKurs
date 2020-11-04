package Day13_IfElse;

import java.util.Scanner;

public class Nested_If {
    public static void main(String[] args) {
        //Girilen bi sayinin once yuzden kucuk ise yuzden kucuk yazsin
        //Devaminda 50 den kucuk ise 50 den kucuk yazsin
        // devaminda 25 den kucuk ise 25den kucuk yazsin...

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Bir sayi girin =");
        int x = sc.nextInt();

        if (x<100) {
            System.out.println("Sayi 100 den kucuktur");
            if (x<50) {
                System.out.println("sayi 50 den kucuktur");
                if (x<25) {
                    System.out.println("sayi 25 den kucuktur");
                }
            }
        }
    }
}
