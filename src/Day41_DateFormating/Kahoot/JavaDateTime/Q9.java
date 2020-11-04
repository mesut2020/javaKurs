package mentoring.DateTime;

import java.time.LocalDate;
//OCA
public class Q9 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,01,32);
        date.plusDays(10);
        System.out.println(date);
    }
}
/*
2012-01-11
Date Time Exception
Compilation Fail
2012-02-10
 */