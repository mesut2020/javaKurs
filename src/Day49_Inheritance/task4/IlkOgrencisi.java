package Day49_Inheritance.task4;

public class IlkOgrencisi extends Ogrenci {


    public IlkOgrencisi( String isim, String tipi) {
        super(sayacID++, isim, tipi);
    }
}
