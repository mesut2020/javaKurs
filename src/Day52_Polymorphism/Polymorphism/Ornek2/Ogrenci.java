package Day52_Polymorphism.Polymorphism.Ornek2;

public class Ogrenci extends Kisi {
    private String sube;

    public Ogrenci(String ad, String soyad, String gorevi, String sube) {
        super(ad, soyad, gorevi);
        this.sube = sube;
    }

    public String getSube(){
        return sube;
    }

}
