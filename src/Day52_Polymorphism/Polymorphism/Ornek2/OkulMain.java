package Day52_Polymorphism.Polymorphism.Ornek2;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Ozal","Tas", "Ogrenci", "4A");
        Calisan cal1 = new Calisan("Faruk", "Yilmaz", "Ogretmen", "Fizik");

        Kisi.kimlikYaz(ogr1);
        Kisi.kimlikYaz(cal1);


    }
}
