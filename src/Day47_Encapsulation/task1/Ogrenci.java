package Day47_Encapsulation.task1;

public class Ogrenci {
    // 1- fieldlari ad, soyad, yas olan bi ogrenci sinifi tanimlayiniz.
    // 2- ogrenci sinifina constructor tanimlayin
    // 3. butun fieldler icin encapsulation uygulayin...
    // 4- Bir okul class i olusturun filed : okulAd, maxOgrenciSayisi, ArrayList cinsinden ogrencileri olsun
    // 5- main metodunun oldugu OkulMain isimli class olustur.
    // 6- bir okul nesnesi olusturup okula ogrenci ekleyin
    //    eklenecek ogrencilerin yasi 15 i gecmemeli.
    //    15 yasindan buyuk ogrenci eklemek istenirse yerine baska ogrenci isteyin
    //    .

    private String ad;
    private String soyad;
    private int yas;

    public Ogrenci(String ad, String soyad, int yas) {
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<15)
            throw new RuntimeException("Kayit icin yas siniri 15 dir.");
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
