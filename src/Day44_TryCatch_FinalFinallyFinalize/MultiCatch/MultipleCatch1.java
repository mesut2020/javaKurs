package Day44_TryCatch_FinalFinallyFinalize.MultiCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch1 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 kez 2 adet sayı alınız ve bölüm sonucunu ekranda gösteriniz.
        for(int i=0;i<5;i++) {

            try {
                System.out.print("1.Sayıyı giriniz=");
                Scanner oku=new Scanner(System.in);
                int a = oku.nextInt();

                System.out.print("2.Sayıyı giriniz=");
                Scanner oku2=new Scanner(System.in);
                int b = oku2.nextInt();

                int c = a / b;
                System.out.println("c = " + c);
            }
            catch (ArithmeticException hata) { // oluşan hataya ilşkin bir catch var ise önce oraya düşer
                System.out.print("hata oldu : ");
                System.out.println("2.Sayıyı 0 vermeyiniz.");
            }
            catch (InputMismatchException hata) { // buraya üstteki hataya düşmezse düşer
                System.out.print("hata oldu");
                System.out.println("Lütfen sayı giriniz.");
            }
        }

    }
}
