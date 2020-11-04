package Day43_StringBuilder_StringBuffer_JavaExceptions_TryCatch_MultiCatch;

import java.time.LocalDate;
import java.util.Scanner;

public class GununSorusu {
// Müşterinin alacağı bir ürün için taksit yapılcacaktır.
// Kullanıcıdan Alıncak olan malın ücret bilgisini ve kaç taksit olacağı bilgisini alınız.
// Taksit rakamları kuruşlu çıkıyorsa kuruşlar toplanıp, son taksite eklensin.
// Günün tarihine göre 1 ay atlatarak oluşan taksit tarihi ve ödencek taksit miktarının listesini yazdırınız.
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Ürün fiyatı nedir = ");  // 134 TL 33.5
        int price = read.nextInt();
        double kurus=0;
        System.out.println("price = " + price);

        System.out.print("Kaç taksitte ödeyeceksiniz = ");  // 4 Taksit olsun
        int installment = read.nextInt();
        double installemnt2=installment;
        System.out.println("installment = " + installment);

        LocalDate buGun = LocalDate.now();

        int count = 0;
        for (int i = 1; i <=installment ; i++) {
            LocalDate actual = buGun.plusMonths(i);
            int taksit = price/installment;
            kurus = price/installemnt2 -taksit; //134-33=101.5
            if(i<installment)
            System.out.println("Ödeme Tarihi = " + actual + " Ödeme Tutarı = " + taksit);
            else System.out.println("Ödeme Tarihi = " + actual + " Ödeme Tutarı = " + (taksit+kurus*installment));
        }
    }
}
// console.log(Math.floor(5.95));// expected output: 5
// console.log(Math.floor(5.05));// expected output: 5
// console.log(Math.floor(5));// expected output: 5
// console.log(Math.floor(-5.05));// expected output: -6
/*Scanner read = new Scanner(System.in);

        System.out.print("Ürün fiyatı nedir = ");  // 134 TL
        double price1 = read.nextDouble();
        System.out.println("price1 = " + price1);

        System.out.print("Kaç taksitte ödeyeceksiniz = ");  // 4 Taksit olsun
        double installment = read.nextDouble();
        System.out.println("installment = " + installment);

        double priceForOneMonth = price1 / installment;

        double decimal = priceForOneMonth - Math.floor(priceForOneMonth);
        System.out.println("decimal = " + decimal);

        double topDeci=decimal*installment;
        System.out.println("topDeci = " + topDeci);

        double price2=price1-topDeci;
        System.out.println("price2 = " + price2);

        double priceForOneMonth2 = price2/installment;
        System.out.println("priceForOneMonth2 = " + priceForOneMonth2);

        LocalDate buGun = LocalDate.now();

        System.out.println("Aylık ÖDeme Tutarı = " + priceForOneMonth2);

        int count = 0;
        for (int i = 1; i < installment + 1; i++) {
            LocalDate actual = buGun.plusMonths(i);
            count++;

            if (i!=installment)
                System.out.println("Ödeme Tarihi = " + actual + " Ödeme Tutarı = " + priceForOneMonth2);
            else
                System.out.println("Ödeme Tarihi = " + actual + " Ödeme Tutarı = " + (price1 - (installment-1)*priceForOneMonth2)); */