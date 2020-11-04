package Day33_Static_NonStatic.Tasks.task1;

public class Task1 {

    public static void main(String[] args) {
        // Math sınıfndaki metodlarından 5 tanesini kendi ismlendirmenizle ayri bir sinifta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarınız kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        System.out.println("MyMath.maxsayi(5,36) = " + MyMath.maxsayi(5,36));
        System.out.println("MyMath.minsayi(5,36) = " + MyMath.minsayi(5,36));
        System.out.println("MyMath.karekok(16) = " + MyMath.karekok(16));
        System.out.println("MyMath.mutlak(-5) = " + MyMath.mutlak(-5));
        System.out.println("MyMath.usalma(2,10) = " + MyMath.usalma(2,10));



    }
}
