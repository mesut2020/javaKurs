package Day22_Java_Methods;

public class javaMethods1 {

    // metod veya fonksiyon

    public static void merhabaDunyaYaz() // Fonksiyonu main den once veya sonra yazabilrsin. Icine yazilmaz
    {
        System.out.println("HELLO WORLD 3");
    }

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World 2");

        merhabaDunyaYaz();
        merhabaDunyaYaz();
        merhabaDunyaYaz();
    }
}
