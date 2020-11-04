package mentoring.DateTime;

import java.time.LocalDate;
import java.time.Period;

public class Q5 {
    public static void main(String[] args) {
        LocalDate pastDate=LocalDate.of(1995, 5, 16);
        LocalDate today = LocalDate.now();
        Period period = Period.between(pastDate, today);
        System.out.println(period.getYears() +" Years "+ period.getMonths()+" Months "+
                period.getDays()+" Days");
    }
}
/*
25 Years 2 Months 5 Days
1995 May 16
Date Time Exception
Compilation Error
 */
