package Day49_Inheritance.task4;

public class Ogrenci {
    // 1- Ogrenci isimli id,isim ve tipi(ilk, lise)  olan bir class oluşturunuz.
    // 2- LiseOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz,
    // 3- İlkOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz,
    // 4- Okul isimli mainde 3 adet öğrenci oluşturunuz,
    // 5- Oluşturuken her öğrenciye, Ogrenci sınıfında tanımlanmış bir sayaçtan no veriniz.

    int id; // class a ait olacagi icin id nin static olmsi lazim
    String isim;
    String tipi;

    public static int sayacID=1;

    public Ogrenci(int id, String isim, String tipi) {
        this.id = id;
        this.isim = isim;
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }
}
