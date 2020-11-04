package Day4_String;

import java.util.Scanner;

public class testString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        String a = sc.nextLine();
        System.out.print("b = ");
        String b = sc.nextLine();

        System.out.println(a.equals(b));
    }
}
