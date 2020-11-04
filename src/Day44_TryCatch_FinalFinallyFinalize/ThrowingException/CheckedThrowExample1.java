package Day44_TryCatch_FinalFinallyFinalize.ThrowingException;

import java.io.IOException;
import java.util.Scanner;

public class CheckedThrowExample1 {
    // kullanıcıdan hava sıcaklığını isteyiniz.
    // ayrı bir metodda bunun kontrolünü yaparak hava
    // sıcaklığı 10 dan küçük ise IOException hatası oluşturunuz
    // mainden çağırarak hatayı kontrol ediniz.

    public static void sicaklikKontrol(int sicaklik) throws IOException {
        // Eğer bir metod içerisinde Checked Throw var ise,
        // metoda adına hata işareti eklenmeden derlenmesine izin verilmez.
        // Hata çizgisini üzerine gelindiğinde Add ... a tıklandığınd aototmatik ekleyecektir.
        // Bu şekidle bu metodu çağıran yerlerin try catch e alınması garantiye alınmış olur.

        if(sicaklik<10) throw new IOException("Hava gercekten soguk disari cikma...");

        System.out.println("Disarida basketbol oynayabilirsin...");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Hava sicakligi = ");
        int sicaklik = sc.nextInt();
        try {
            sicaklikKontrol(sicaklik);
        }
        catch(Exception e){
            System.out.println("e = " + e);
        }

    }
}
