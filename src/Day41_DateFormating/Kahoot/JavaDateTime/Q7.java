package mentoring.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//OCA
public class Q7 {
    public static void main(String[] args) {
        String date= LocalDate
                .parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
/*
May 04,2014T00:00:00
2014-05-04T00:00:00
RunTime Exception
Compilation Fail
 */
