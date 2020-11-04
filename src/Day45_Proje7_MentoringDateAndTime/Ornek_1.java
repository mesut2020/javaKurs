package Day45_Proje7_MentoringDateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ornek_1 {

    /*
        ayEkle adli bir metod olusturunuz
        return type bir String
        parametrsi de int(myMonth)

        bugunun tarihini ve
        ardindan uzerine ay eklenmis halini return yapiniz



     mesela:

        bugunun tarihi 07/24/2020
        myMonth = 4

        return  11/24/2020
    */

    public static String ayEkle(int myMonth){

        LocalDate tarih = LocalDate.now();

        System.out.println("ay eklemeden once " + tarih);

        tarih = tarih.plusMonths(myMonth);

        System.out.println("ayi ekledikten sonra " + tarih);

        DateTimeFormatter formatliTarih = DateTimeFormatter.ofPattern("MM/dd/YYYY");

        String format = tarih.format(formatliTarih);

        System.out.println(format);

        return format;
    }

    public static void main(String[] args) {


        ayEkle(4);
    }
}
