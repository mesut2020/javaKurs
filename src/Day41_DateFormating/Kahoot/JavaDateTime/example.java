package mentoring.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//OCA example
public class example {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.of(2020,7,21,1,1,15,15);
        System.out.println("ISO_DATE: "+dt.format(DateTimeFormatter.ISO_DATE));
        System.out.println("ISO_TIME: "+dt.format(DateTimeFormatter.ISO_TIME));
        System.out.println("ISO_DATE_TIME: "+dt.format(DateTimeFormatter.ISO_DATE_TIME));

        System.out.println("-----------------");
        LocalDateTime now=LocalDateTime.now();
        System.out.println("suan:"+now);

        System.out.println("-----------------");
        dt=dt.plusDays(5);
        System.out.println("5 gun eklendi:"+dt);

        System.out.println("-----------------");
        LocalDate today = LocalDate.parse("2019-03-29");
        System.out.println("parse:"+today);

    }
}

