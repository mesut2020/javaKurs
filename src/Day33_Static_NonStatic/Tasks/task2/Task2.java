package Day33_Static_NonStatic.Tasks.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    //Bir üniversitede ögrencilere ders kaydı yapılacaktır.
    //1-  Ders sınıfı adı: Lesson ,fields :  name, credit (1-3 arası deger alıyor)
    //2- Ögrenci Sınıfı ayrı dosyada : adı : Student,
    // fields: name, maxCredit, ders listesi tutacak bir liste
    //3- LessonCreate adında ders olusturabılecegımız bır metod ekleyınız.
    // Bu metodu dırek kullanmak ıstıyoruz.
    // Bir adet ogrenci tanimlayin, alacagi max kredit 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
    //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
    //    uyarı versi, alabileceğiniz max credi doldu şeklinde.

    // Ödev
    // 6- Aşağıdaki ders oluşturma kısmı için ilgili sınıfta lessonCreate adında bir metod
    //    oluşturunuz
    // 7- Öğrenciye ders ekleme bölümünü yine ilgili sınıfta bir metod olarak yazınız.

    public static void main(String[] args) {

        Lesson math101 = Lesson.createLesson("Matematik", 3);
        Lesson java101 = Lesson.createLesson("JavaProgramming", 6);
        Lesson fizik101 = Lesson.createLesson("Fizik", 4);

        Student student1 = Student.createStudent("Ali Veli", 10);
        
        student1.dersListesi = new ArrayList<>();

        if (student1.totalCredit() + math101.credit <= student1.maxCredit)
            Student.addLessontoStudent(student1.dersListesi,math101);
        else System.out.println("Alabileceginiz kredi miktari doldu...");

        if (student1.totalCredit() + math101.credit <= student1.maxCredit)
            Student.addLessontoStudent(student1.dersListesi,java101);
        else System.out.println("Alabileceginiz kredi miktari doldu...");

        if (student1.totalCredit() + math101.credit <= student1.maxCredit)
            Student.addLessontoStudent(student1.dersListesi,fizik101);
        else System.out.println("Alabileceginiz kredi miktari doldu...");

        Student.derslerYaz(student1.dersListesi);
        System.out.println("math101.name = " + math101.name);

    }
}
