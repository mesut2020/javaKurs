package Day23_Java_Methods;

public class JavaMethods1 {
    public static String AdSoyadBirlestir(String ad, String soyad)
    {
        return ad+" "+soyad;
        //System.out.println(ad+" "+soyad);
    }

    public static int enBuyukBul(int a, int b)
    {
        if (a>b)
            return a; // returnun görevi bu fonksiyonu çağıran yere değeri göndermek
        else
            return b;

        // return Math.max(a,b);
    }

    public static void merhabaYaz()
    {
        System.out.println("Merhaba Dünya");
    }

    public static void main(String[] args) {

        System.out.println("Merhaba Dünya 1");
        System.out.println("Merhaba Dünya 2");

        merhabaYaz();

        int enb = Math.max(3,4); // 2 sayıdan en büyüğünü bulup

        int enbTurkce= enBuyukBul(3,4);

        String adsoyad= AdSoyadBirlestir("Mesut", "Dogan");
        System.out.println("adsoyad = " + adsoyad);
        // burda birleşmiş haline ulaşabiliyormuyum şu anda, return yaptığımda geri alabildim
    }
}
