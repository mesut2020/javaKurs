package Day42_DateAndTime.Others;

import java.time.LocalDate;

public class _3_ComparingDateAndTime {

    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dun = bugun.minusDays(1);

        boolean after = bugun.isAfter(dun); // true
        System.out.println("after = " + after);
        
        boolean before = bugun.isBefore(dun);
        System.out.println("before = " + before);
        
        boolean equal = bugun.isEqual(dun);
        System.out.println("equal = " + equal);
        
        boolean leapYear = bugun.isLeapYear();  // Artik yil, subat 29 ceker
        System.out.println("leapYear = " + leapYear);
        
        int fark = bugun.compareTo(dun); // 2 tarih arasindaki farkin en buyuk parcasini verir.
        System.out.println("fark = " + fark);

        LocalDate date = LocalDate.of(2019, 12,30 );
        int fark2 = bugun.compareTo(date); // 2 tarih arasindaki farkin en buyuk parcasini verir.
        System.out.println("fark = " + fark2);
    
    }
}
