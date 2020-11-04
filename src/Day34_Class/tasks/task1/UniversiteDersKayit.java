package Day34_Class.tasks.task1;

public class UniversiteDersKayit {
    // Universite Ogrencilere Ders Kaydi programi yapilmak isteniyor
    // Once ders tanimlamalari yapilacak, sonra ogrencilerin kredi hakkina gore bu dersler ogrencilere eklenecek.
    // 1- Adim:Yeni ders olusturmak icin Lesson adinda bir sinif tanimlayiniz: fields: name, hours
    // 2- Adim: Ders olusturma metodunu yaziniz...
    // 3- Adim: 3 adet ders tanimlayin (math101 6 saat, fizik101 4 saat, java101 6 saat)
    // 4- Adim:Student isminde yeni vir class tanimlayin. (fields: name, maxAlabilecegiDersSaatMiktari)
    // 5- Adim: ogrenci olusturmayi bir method ile  yaziniz.
    // 6- Adim: 2 adet ogrenci olusturun. (Mehmet - maxCredit =20, Ayse - maxCredit = 12)
    // 7- Adim: Ogrenciye ders eklemek icin, Student sinifina bir ders listesi tutacak bir field ekleyiniz.
    // 8- Adim: Ogrenciye ders ekleyen addLesson isimli bir method yaziniz.
    //          Ders eklenirken toplam ders saat maktari ogerencinin alabilecegi maxCredit i acmasin
    //          asarsa uyari versin...
    //

    public static void main(String[] args) {


        Lesson math101 = Lesson.createLesson("math101", 6);
        Lesson fizik101 = Lesson.createLesson("fizik101", 4);
        Lesson java101 = Lesson.createLesson("java101", 6);

        Student Ali= Student.createStudent("Ali",20);
        Student Veli= Student.createStudent("Veli",12);

        Ali.addLesson(math101);
        Ali.addLesson(fizik101);
        Ali.addLesson(java101);

        Veli.addLesson(math101);
        Veli.addLesson(fizik101);
        Veli.addLesson(java101);

        Ali.printLessons();
        Veli.printLessons();

    }
}
