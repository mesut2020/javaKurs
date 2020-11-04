package Day52_Polymorphism.Polymorphism.Ornek2;

public class Calisan extends Kisi{
    private String departman;

    public Calisan(String ad, String soyad, String gorevi, String departman) {
        super(ad, soyad, gorevi);
        this.departman = departman;
    }

    public String getDepartman(){
        return departman;
    }


}
