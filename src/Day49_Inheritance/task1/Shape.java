package Day49_Inheritance.task1;

public class Shape {
    // 1-aşağıdaki hiyerarşiye göre sınıfları olusturunuz (+ main icin bir class)
    //Shape
    //  Circle (alan hesaplamasi olmayacak)
    //  Rectangle
    //      Square

    // 2- Türetilen sınıflardan uygun olanlarına yarıcap, uzunluk ve genislik ekleyiniz.
    // 3- Her bir sınıfa consructor ekleyiniz.
    // 4- Her metodun toStringini override yapınız.
    // 5- Her sınıfa alan ve çevre hesaplaması metodlarını ekleyiniz.
    // 6- Main de bunlardan nesne oluşturup sonuçları yazdırınız.
    // 7- En üst sınıfta , türetilen sınıflarda uygun metodu olamayan sınıflar için hata mesajı ürettiriniz.


    @Override
    public String toString() {
        return "sekil : Bilgi yok...";
    }

    public double getArea(){
        throw new RuntimeException("Bu sinifin bu metod ozelligi yoktur");
    }

    public double getCircumference() {
        throw new RuntimeException("Bu sinifa bu metod implemente edilmemistir...");

    }
}
