package Day48_Inheritance.Extends1;

public class Yonetici2 extends Personel {

    int bagliPersonelSayisi;
    double gorevTazminati;

    public void zamYap(int yuzde)
    {
        System.out.println(yuzde +
                " personele zam yapıldı.");
    }

}

//  Yonetici class da hepsini tek tek yaptik.
//  Ama Yonetici2 classta
//  miras yontemi ile  daha kolay bir yontem oldu
//  Yoneticide bir personel oldugu icin sadece Yoneticiye
//  eklenecekleri ekledik
//  personel de yoneticinin kullanmayacagi bir degsiken
//  tanimlamak, inheritance yontemine engel degil
