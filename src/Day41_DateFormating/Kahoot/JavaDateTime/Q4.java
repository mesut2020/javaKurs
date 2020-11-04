package mentoring.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q4 {
    public static void main(String[] args) {
        LocalDate d=LocalDate.of(2020,10,21);
        LocalTime t= LocalTime.of(19,15,15);
        LocalDateTime dt=LocalDateTime.of(d,t);
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd MM yyyy hh:mm a");
        System.out.println(dt.format(format1));
    }
}
/*
Wed 21 Oct 2020 19:15 PM
Wed 21 10 2020 07:15 PM
 21 October 2020 07:15:15
 21 10 2020 19:15:15

 */