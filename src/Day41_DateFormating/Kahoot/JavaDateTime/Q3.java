package mentoring.DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q3 {
    public static void main(String[] args) {
        LocalTime time=LocalTime.of(20,4,6);
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(time.format(format1));
    }
}
/*
20:04:06
20:04
08:04:06
08:04
 */