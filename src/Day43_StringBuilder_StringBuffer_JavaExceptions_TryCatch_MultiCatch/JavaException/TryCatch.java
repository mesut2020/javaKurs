package Day43_StringBuilder_StringBuffer_JavaExceptions_TryCatch_MultiCatch.JavaException;

import java.time.LocalDate;
import java.time.Month;

public class TryCatch {

    public static void main(String[] args) {
        int a = 10;
        try { // dene, hatanın başladığı yerin üstüne konur
            System.out.println(" try calisti...");

            a+=5;
            LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
            System.out.println(" işlem tamam");
        } // hatanın bittiği yerde parantez kapatılır
        catch(Exception hata) // hata olduğunda yapılacak işlemler burdan aşağıda parantez arasına yazılır.
        {
            // hata olduğunda en yazpılacağı buraya yazılıyor.
            System.out.println("hata oldu");
            System.out.println("hata: " +   " tarih dönüşüm hatası");
            System.out.println("hata.getMessage() = " + hata.getMessage());
            System.out.println("hata.toString() = " + hata.toString());
            System.out.println("hata.getStackTrace() = " + hata.getStackTrace());
            System.out.println("hata.getLocalizedMessage() = " + hata.getLocalizedMessage());
        }

        System.out.println("Programın sonuna kadar gelindi.");
        System.out.println("a = " + a);
    }
}

