package Day14_Loop;

import java.util.Scanner;

public class While_Loop3 {
    public static void main(String[] args) {
        //Girilen bir sayiya kadar olan sayilardan sadece tek olanlari yaziniz...
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz =");
        int num = sc.nextInt();

        int num1=0;

        while(num>0) {
            num1++;
            if (num1%2==1)
            System.out.println(num1);
            num--;
        }

    }
}
