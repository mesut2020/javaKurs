package Day16_ForLoop_break_continue;

import java.sql.SQLOutput;
import java.util.Scanner;

public class for_loop_6 {
    public static void main(String[] args) {
        // Girilen bir stringdeki a harfi sayisini bilunuz
        //c harfine sira gelirse donguden cikilsin...

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir String giriniz...: ");
        String str1= sc.nextLine();
        int a=0;

        for (int i=0; i<=str1.length();i++) {

            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'A')
                a++;
            else
                if (str1.charAt(i) == 'c'||str1.charAt(i) == 'C')
                    break;
            System.out.print(str1.charAt(i));
        }

        System.out.println("\na harfinden, c harfine kadar " +a+ " tane var... ");
    }

    /*
    Scanner sc=new Scanner(System.in);
        System.out.println("Bir string girin: ");
        String text=sc.nextLine();
        int sayı=0;
        for (int i=0;i<text.length();i++){
            String harf=text.substring(i,i+1);

            if (harf.equalsIgnoreCase("a"))sayı++;
            else if (harf.equalsIgnoreCase("c"))break;

        }
        System.out.println("sayı = " + sayı);
     */
}
