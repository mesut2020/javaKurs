package Burak.TryCatch;

import java.io.File;
import java.io.FileReader;

public class Ornek7 {

    public static void main(String[] args) {
        try {
            File dosya = new File("C:\\Users\\medog\\Desktop\\testFile.txt"); // "C:\Users\medog\Desktop\testFile.txt" "C:\\Users\\mehmet\\Desktop\\Not Belgesi.txt"
            FileReader fileReader = new FileReader(dosya);
        } catch (Exception ex) {
            System.out.println("Dosya bulunamadı: ");
            System.out.println(ex.getMessage());
        }
    }
}

// Bu kod bilgisayarımızdaki bir dosyayı kontrol ediyor.

// dosya konumunu bulmak için, kontrol etmek istediğimiz dosyanın üstüne
    // gelip SHIFT + Sağ Click yaptıktan sonra yol olarak kopyala demeliyiz.

//Sonrasında Yukarıda benim dosyamın Path'i (Yol) gibi düzenlemeliyiz.

//Bu dosya bulma olayları birkaç hafta sonra başlayacak. Şimdiden gözünüze yabancı gelmesin diye yapabilirizsiniz.