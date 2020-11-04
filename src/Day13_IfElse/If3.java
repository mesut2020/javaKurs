package Day13_IfElse;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        // katsayilari verilen iki bilinmeyenli denklemin koklerini bulunuz.
        // ax^2 + bx + c;
        // kullanicidan a, b, c yi okutun.
        // Delta = bc-4ac
        //Delta > 0 => 2 tane kok vardir. x1= -b + kok(d)/(2a), x2= (-b -kok(d))
        // Delta = 0 => 1 tane kok vardir x=-b/2a
        // delta<0 ise kok yoktur

        Scanner sc = new Scanner(System.in) ;
        System.out.println("a =");
        int a = sc.nextInt();
        System.out.println("b =");
        int b = sc.nextInt();
        System.out.println("c =");
        int c = sc.nextInt();

        int delta = b*c-4*a*c;

        if (delta>0) {
            System.out.println("x1: " + ((-b + Math.sqrt(delta)) / (2*a)));
            System.out.println("x2: " + ((-b - Math.sqrt(delta)) / (2*a)));
        }
        else
            if (delta==0) {
                System.out.println("x: " + (-b / 2 * a));
            }

        else
            System.out.println("kok yoktur");




    }
}
