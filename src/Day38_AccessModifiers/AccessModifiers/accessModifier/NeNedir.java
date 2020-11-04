package Day38_AccessModifiers.AccessModifiers.accessModifier;

public class NeNedir {

    /*

    Access Modifier lar ne demektir?

    erisim duzeyini duzenliyorlar
    bir class in spesifik bir class a ve onun field, constructor ve mehodlarina erisimi saglayan erisim degistiricileri


    Aralarindaki farklar nelerdir?

    public
        Public erişim düzenleyici en yüksek seviyede erişim düzenleyicisidir.
        Kalıtım yolu ile aktarılır, farklı projelerden veya proje içerisinde herhangi bir yerden erişilebilir durumdadır.

    protected
        Protected erişim düzenleyicisi genel olarak private gibi hareket eder.
        Aralarındaki tek fark protected olarak işaretlenmiş olan yapılar kalıtım yolu ile aktarılabilmektedir.
        Geri kalan tüm özellikleri private ile aynıdır.

    private
        Private erişim düzenleyicisi en kısıtlı erişim düzenleyicisidir.
        Sadece ilgili tip içerisinden erişilebilirler.
        Private tanımlamasını değişkenlere ve methodlara atayabiliriz.
        Kalitim yolu ile aktarilmaz.

    default (package private)
        Sadece o proje içerisinden erişilebilmesi anlamına gelmektedir.
        Farklı projelerden erişim söz konusu değildir.


    Class icin yalnizca public ve default modifier lar kullanilabilir.


     */

    /** https://docs.google.com/presentation/d/1EXPfUPFwLJQzmHrfYvoBo6J9DFLlXXyoFMUBw82RZNc/edit?usp=sharing
     *
     */

    public int yas;
    protected double numara;

    //encapsulation
    private int yil = 1994;
    public void yiliYazdir(){
        System.out.println(yil);
    }

    String isim;

    /*  ornek1

     adi eyaletVergisi olan bir method olusturun
     ve bu method sadece ayni package icinde erisilebilir olsun
     return tipi double ve parametresi bir String
     tum $ ve , isaretlerini kaldirip, degeri double olarak degistiriniz (vergi orani ise double degerin 7.75 idir)

     */

    double eyaletVergisi(String rakam){

        rakam = rakam.replace("$", "");
        rakam = rakam.replace(",", "");

       // rakam = rakam.replaceAll("\\$","").replaceAll("\\,","");

        double deger = Double.valueOf(rakam);
        double vergi = deger * 0.0775;

        return vergi;
    }

}
