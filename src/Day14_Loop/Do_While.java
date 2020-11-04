package Day14_Loop;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        //Kullanicidan 0 girilene kadar sayi isteyin
        // bu soruyu once while sonra do_while

          Scanner sc = new Scanner(System.in);
          int num=1;
//        while(num!=0) {
//            System.out.print("Sayi giriniz=");
//            num = sc.nextInt();
//        }
        do{
            System.out.print("Sayi giriniz=");
            num=sc.nextInt();
        }while(num!=0);
    }
}
