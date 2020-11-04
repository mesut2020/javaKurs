package Burak.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kodumuz başlatılıyor...");

        int sayi = 0;
        int[] arr = new int[3];

        try {
            sayi = 2;
//            arr[4] = 10;
//            sc.nextInt();
        }catch (ArithmeticException bolmeHata){
            System.out.println(bolmeHata.getMessage());

        }catch (ArrayIndexOutOfBoundsException arrayHata){
            System.out.println(arrayHata.getMessage());

        }catch (InputMismatchException scannerHatasi){
            System.out.println(scannerHatasi.toString());
        }finally {
            System.out.println("Finally her durumda çalışır.");
        }

        System.out.println("Kodumuz bitiriliyor...");
    }
}
