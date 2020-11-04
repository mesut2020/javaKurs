package Day13_IfElse;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        // girilen sayinin onlar basamaginin degerini yazi ile yaziniz.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz =");
        int num = sc.nextInt();
        int onlar=(num/10)%10;

        switch (onlar) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            case 0:
                System.out.println("sifir");
                break;

        }

    }
}
