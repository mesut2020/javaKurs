package Day38_AccessModifiers.nonAccessModifier.staticModifier;

public class Ogrenciler {

    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Ali", "Yilmaz");
        Ogrenci ogr2 = new Ogrenci("Ayse","Demir");
//        ...
//        ...
//        ...
        Ogrenci ogr500 = new Ogrenci("Mehmet", "Kaya");
        // 500 tane ogrenci olusturuldu...

        ogr1.print();
        ogr2.print();
        ogr500.print();

    }


}
