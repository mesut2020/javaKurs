package Day44_TryCatch_FinalFinallyFinalize.TryCatch;

import java.util.Scanner;

public class TryCatch1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1. Sayiyiyi giriniz : ");
        try {
            int a = sc.nextInt();

            System.out.print("2. sayiyi giriniz : ");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("c = " + c);
        }
        catch (Exception hata) // hata olduğunda çalışacak bölüm
        {
            System.out.println("hata oldu");
//            System.out.println("hata.getMessage() = " + hata.getMessage());
//            hata.printStackTrace();
            System.out.println("2.Sayıyı 0 vermeyiniz.");
        }


    }
}
