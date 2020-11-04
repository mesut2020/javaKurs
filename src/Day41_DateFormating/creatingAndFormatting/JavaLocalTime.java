package Gun41.creatingAndFormatting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalTime {
    public static void main(String[] args) {
        
        // Tarih içermez sadece saat, dak, san içerir 9:00 am gibi)
        LocalTime time1= LocalTime.now(); // o andaki zaman
        
        LocalTime time2 = LocalTime.of(21, 12);
        LocalTime time3 = LocalTime.of(21,45, 12);

        // o anda alınan bilgileri.
        System.out.println("time1.getHour() = " + time1.getHour());
        System.out.println("time1.getMinute() = " + time1.getMinute());
        System.out.println("time1.getSecond() = " + time1.getSecond());
        System.out.println("time1.getNano() = " + time1.getNano());

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("hh:mm:ss a"); // a: am, pm , localizasyon türkçe olduğu için ÖÖ, ÖS
        System.out.println("time1.format(format1) = " + time1.format(format1));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm:ss"); // HH 24 lü saat sistemine göre
        System.out.println("time1.format(format2) = " + time1.format(format2));

        System.out.println("time1 = " + time1);
        LocalTime time4= LocalTime.now();
        System.out.println("time4 = " + time4);

        System.out.println("SHORT Date = " + time1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println("MEDIUM Date = " + time1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

    }
}
