package Day14_Loop;

import java.util.Scanner;

public class While_Loop2 {
    public static void main(String[] args) {
        //girilen bir sayiya kadar olan sayilarin toplami bulup yazdiriniz...

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz =");
        int m = sc.nextInt();

        int counter = 0;
        int total = 0;

        while(counter<m) {   //while(a>0) {toplam=toplam+a--;}
            counter++;
            total= total + counter; //total+=counter;
        }
        System.out.println("Total = " +total);
    }
}
