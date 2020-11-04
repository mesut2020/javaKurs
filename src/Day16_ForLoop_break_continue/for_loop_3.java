package Day16_ForLoop_break_continue;

import java.util.Scanner;

public class for_loop_3 {
    public static void main(String[] args) {
        // kullanicinin girecegi rakama kadar olan sayialrin toplami...

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();

        int total=0;
        for(int i=1; i<=num; i++) {

            total+= i;
        }
        System.out.println("Total = " +total);
    }
}
