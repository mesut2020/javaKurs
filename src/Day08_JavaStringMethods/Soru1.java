package Day08_JavaStringMethods;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve soyadınızı giriniz = ");
        String adAd2Soyad=oku.nextLine();

        //Ahmet Emin Yılmaz
        // A : adAd2Soyad.CharAt(0);
        // E : 1.boşluk karakterinin indexinin 1 fazlası
        // Y : Son boşluğun indexinin 1 fazlası

        char adIlkHarf = adAd2Soyad.charAt(0);
        char ad2IlkHarf = adAd2Soyad.charAt( adAd2Soyad.indexOf(" ")+1 );
        char soyadIlkHarf = adAd2Soyad.charAt( adAd2Soyad.lastIndexOf(" ")+1 );

        // 2.Yöntem
        int ilkBoslukIndex = adAd2Soyad.indexOf(" ");
        int sonBoslukIndex = adAd2Soyad.lastIndexOf(" ");

        ad2IlkHarf = adAd2Soyad.charAt( ilkBoslukIndex+1 );
        soyadIlkHarf = adAd2Soyad.charAt(sonBoslukIndex +1 );
        /*****************************************************/
        System.out.println(adIlkHarf+"."+ad2IlkHarf+"."+soyadIlkHarf+".");
    }
}

