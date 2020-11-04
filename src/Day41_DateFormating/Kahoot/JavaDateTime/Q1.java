package mentoring.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q1 {
    public static void main(String[] args) {
        LocalDate date1= LocalDate.now();
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("date1:"+date1.format(format1));
    }
}
/*
date1:21 07 2020
date1:21/07/2020
date1:21.07.2020
date1:21 July 2020
 */