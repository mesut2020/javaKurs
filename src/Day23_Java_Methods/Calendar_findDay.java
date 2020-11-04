package Day23_Java_Methods;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Calendar_findDay {
    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");

    public static String getDay(String day, String month, String year) {

        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);

        Calendar c = Calendar.getInstance();
        c.set(y, m-1, d);

        int p = c.get(Calendar.DAY_OF_WEEK);
        String s = days.get(p-1);
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("month/day/year sirasi ile aralarinda bosluk birakark giriniz...");
        String month = in.next(); // nextLine dan farki bosluktan sonra bosluk disinda bir karakter girince digerine gecer...
        String day = in.next();   // ornek: 3 2 1978 ile 3   2      1978 ayni.
        String year = in.next();

        int a = in.nextInt(); // int de yukaridaki gibi bolsuk ile degisir.
        int b = in.nextInt();

        System.out.println(getDay(day, month, year));

    }
}