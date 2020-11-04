package mentoring.DateTime;

import java.time.LocalDate;
import java.time.Month;

public class Q2 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2018, Month.MAY,30);
        System.out.println(date.getYear()+" "+date.getMonth()+" "
                +date.getDayOfMonth());
    }
}
/*
2018 MAYIS 30
2018 MAY 30
Compilation Fail
A Runtime Exception
 */