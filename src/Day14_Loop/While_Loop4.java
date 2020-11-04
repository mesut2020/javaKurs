package Day14_Loop;

import java.util.Scanner;

public class While_Loop4 {
    public static void main(String[] args) {
        // Kullanicidan 5 sayi isteyin bu sayilardan en buyugunu bulunuz...
        Scanner sc = new Scanner(System.in);
        int counter=1;

        System.out.println("5 sayi giriniz...");

        System.out.print("1.sayiyi giriniz ="); // negatif sayilar icin sart...
        int num = sc.nextInt();
        int min=num;
        int max=num;

        while (counter<5){
            System.out.print(counter+1+".sayiyi giriniz =");
            num = sc.nextInt();
            if (max<num) max=num;
            if (min>num) min=num;
            counter++;
        }
        System.out.println("Max=" + max);
        System.out.println("Min=" + min);

    }
}
