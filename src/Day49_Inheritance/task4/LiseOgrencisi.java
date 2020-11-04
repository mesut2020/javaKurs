package Day49_Inheritance.task4;

public class LiseOgrencisi extends Ogrenci {
    public LiseOgrencisi(String isim, String tipi) {
        super(sayacID++, isim, tipi);
    }
}
