package Day12_MathRandomAndTernary;

import java.util.Scanner;

public class JavaRandom10 {
    public static void main(String[] args) {
        // Kullanıcıdan alt ve üst değeri  tek bir satırda arasında boşluk olarak (önce min bir boşluk
        // sonra max değeri) alarak sayı üretiniz ve ekrana yazdırınız.
        // 34 56 şeklinde tek bir satırda girecek min ve max ı   5 75

        Scanner oku = new Scanner(System.in);
        System.out.print("min max degerini yan yana bir boşlukla giriniz =");
        String min_max = oku.nextLine();

        int boslukIndex=min_max.indexOf(" ");
        int min = Integer.parseInt( min_max.substring(0, boslukIndex) );
        int max = Integer.parseInt( min_max.substring(boslukIndex+1) );

        int randomNumberInRange = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("randomNumberInRange = " + randomNumberInRange);

        //  Math.random() -> 0  - 0,9999
        // 0-10 a kadar sayı üretmesini istersem : Math.random*10  ->  0 - 9,999    -> 0-9    -> 10 dahil olması için +1
        //2 ile 5 arası istiyorsam  min 2   max 5
        //  3 e akdar olan sayıları buluyorum 0-3   + min ->  2 5 ekarşılık gelir
    }
}
