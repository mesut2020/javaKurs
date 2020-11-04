package Day16_ForLoop_break_continue;

import java.util.Scanner;

public class for_loop_4 {
    public static void main(String[] args) {
        //verilen bir sayinin faktoriyelini hesaplayiniz.

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int faktoriel=1;
        for(int i=1; i<=num; i++) {

            faktoriel*= i;
        }
        System.out.println("Total = " +faktoriel);

    }
}
