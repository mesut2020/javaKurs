package Day51.task2;

// girilen bir sayinin basamklarina gore tersini yazdiriniz...

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Tersi alinacak sayiyi giriniz : ");
        int num = sc.nextInt();
        int tersSayi=0;

        do{
            tersSayi*=10;
            int a=num%10;  // 12345     54321
            tersSayi+=a;
            num=num/10;
        }while(num>0);

        System.out.println(tersSayi);

       // for(int i=1; i<=100;i++)
           // System.out.println(i); // sadece burayi degistirerek 100 den geriye yazdir... (101-i)

        int a =10;
        int b=20;

        int c = a = b+= a/5;

        System.out.println(a+" "+b+" "+c);

        int x,y,z;
        x=y=z=10;



    }
}

