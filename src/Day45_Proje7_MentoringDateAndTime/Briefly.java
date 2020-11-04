package Day45_Proje7_MentoringDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Briefly {

    /*
    Date class nedir?

    Neden kullaniyoruz?
        Ikea sayfasinda signup ornegi uzerinden gidebilirsin.

        Mesela;

        Bugunun tarihi Temmuz 24, 2020
        Eger ki Temmuz 25, 2002 yazsaydim o zaman hata alacaktim

        Bir sonraki gun giris yapip bu sefer de Temmuz 26, 2002 yazsaydim yine hata verecekti, bunlarin konrolunu
        date class ile yapiyoruz.

    Ogrenmemiz gerekli mi?
        Is gorusmelerinde ve OCA sinavinda bu konu ile karsilasacaksinizdir.

     */

    /*
        ornegin

        Bugunun tarihini ve  MM/dd/YYYY seklinde degistirilmis halini print ediniz.
     */

    public static void bugununTarihi(){

        LocalDate tarih = LocalDate.now();

        System.out.println("bugunun tarihi " + tarih);

        DateTimeFormatter formatliTarih = DateTimeFormatter.ofPattern("MM/dd/YYYY");

        String format = tarih.format(formatliTarih);

        System.out.println("format edilmis hali " + format);


    }

    public static void saat(){

        LocalTime zaman = LocalTime.of(10,0,30);

        System.out.println("format oncesi " + zaman);

        DateTimeFormatter formatliZaman = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        String format = zaman.format(formatliZaman);

        System.out.println("formatli zaman " + format);
    }

    public static void saatVeTarih(){

        LocalDate tarih = LocalDate.of(2020,05,24);
        LocalTime zaman = LocalTime.of(5,30);

        LocalDateTime zamanVeTarih = LocalDateTime.of(tarih, zaman);

        System.out.println("format oncesi " + zamanVeTarih);

        DateTimeFormatter zt = DateTimeFormatter.ofPattern("HH:mm MM dd yyy");

        String format = zamanVeTarih.format(zt);

        System.out.println(format);
    }


    public static void main(String[] args) {


        bugununTarihi();

        saat();

        saatVeTarih();
    }


}
