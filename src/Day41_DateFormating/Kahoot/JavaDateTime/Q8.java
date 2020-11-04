package mentoring.DateTime;

import java.time.LocalDate;
//OCA
public class Q8 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,1,30);
        date.plusDays(10);
        System.out.println(date);
    }
}
/*
2012-02-10
2012-01-20
2012-02-10 00:00
2012-01-30
 */
