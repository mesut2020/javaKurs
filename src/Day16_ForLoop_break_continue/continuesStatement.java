package Day16_ForLoop_break_continue;

import java.util.Scanner;

public class continuesStatement {
    public static void main(String[] args) {
        //Girilen bir stringin hafini teker teker ekrana alt alta olacak sekilde yazin...
        //bosluk veya a harfi geldiginde yazmasin, es gecsin...

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir cumle yazin...");
        String text = sc.nextLine();



        for (int i=0; i<text.length(); i++)
        {
            if (text.charAt(i) =='a' || text.charAt(i) == ' ')
                continue; // bu sartta atla devam et...

            System.out.print(text.charAt(i));
        }
    }
}
