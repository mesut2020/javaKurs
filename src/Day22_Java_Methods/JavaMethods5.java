package Day22_Java_Methods;

import java.util.Scanner;

public class JavaMethods5 {
    public static void addition(int num1,int num2)
    {
        System.out.println("Total = " + (num1+num2));
    }
    public static void subtruction(int num1,int num2)
    {
        System.out.println("Total = " + (num1-num2));
    }
    public static void multiplication(int num1,int num2)
    {
        System.out.println("Total = " + (num1*num2));
    }
    public static void division(int num1,int num2)
    {
        System.out.println("Total = " + (num1/num2));
    }
    public static void fakt(int num1)
    {
        int result=1;
        for (int i = 1; i <= num1; i++)
        {
            result*=i;
        }
        System.out.println("Total = " + result);
    }


    public static void main(String[] args) {
        // Kullanıcıya aşağıdaki gibi bir menü çıakrtarak değişkenleri alınız ve
        // her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplam
            2-çıkarma
            3-toplama
            4-bolme
            5-Faktöryel ekle sonra
            6-Çıkış
        Bir işlem seçiniz */

        Scanner sc = new Scanner(System.in);
        int choose = 0;
        int num1=0;
        int num2=0;

        do {
            System.out.print("1-toplam\n2-çıkarma\n3-toplama\n4-bolme\n" +
                    "5-Faktöryel ekle sonra\n6-Çıkış\nBir işlem seçiniz...");

            choose = sc.nextInt();

            switch (choose) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.print("1. sayi = ");
                    num1=sc.nextInt();
                    System.out.print("2. sayi = ");
                    num2=sc.nextInt();break;
                case 5:
                    System.out.print(" sayi = ");
                    num1=sc.nextInt();break;

            }

            switch (choose) {
                case 1:
                    addition(num1,num2); break;
                case 2:
                    subtruction(num1,num2);break;
                case 3:
                    multiplication(num1,num2);break;
                case 4:
                    division(num1,num2);break;
                case 5:
                    fakt(num1);break;
            }

        } while (choose!=6);

        System.out.println("Programdan ciktiniz...");
    }
}
