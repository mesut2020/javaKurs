package Day48_Inheritance.Extends1;

public class SirketMain {
    public static void main(String[] args) {
        Yonetici2 mudur=new Yonetici2();

        // Personelin her fieldını kullanabiliyor
        // erişim izni olunca
        mudur.maas = 3000;
        mudur.departman="Destek Birimi";

        // hem kendi hem de personelin metodlarını
        // kullanabiliyor.
        // Erişim izni olunca
        System.out.println(mudur.getMaas());
        mudur.zamYap(10);

    }
}
