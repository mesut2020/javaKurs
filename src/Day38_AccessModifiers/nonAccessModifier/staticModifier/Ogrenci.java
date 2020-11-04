package Day38_AccessModifiers.nonAccessModifier.staticModifier;

public class Ogrenci {
    String ad;
    String soyad;
    String okulAd="Yildirim";


    public Ogrenci (String ad, String soyad){
        this.ad = ad;
        this.soyad = soyad;
        //this.okulAd=okulAd;
    }

    void print(){
        System.out.println(ad+" "+soyad+" "+okulAd);

    }
}
