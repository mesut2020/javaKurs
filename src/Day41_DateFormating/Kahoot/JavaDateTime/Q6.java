package mentoring.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q6 {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.now();
        LocalDate date2=LocalDate.of(2020,7,21);
        LocalDate date3=LocalDate.parse("2020-07-21", DateTimeFormatter.ISO_DATE);
        System.out.print(" d1="+date1);
        System.out.print(" d2="+date2);
        System.out.print(" d3="+date3);
    }
}
/*
Tarihi 21 Temmuz 2020 olarak alalim, sonuc ne olur?
 */