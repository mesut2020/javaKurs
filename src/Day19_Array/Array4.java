package Day19_Array;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir cumleyi kelimelerine bolerek alt alta yazdirin.

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir cumle giriniz..");
        String text = sc.nextLine();



        String[] words= text.split(" "); //bosluk karakterine gore boler...

        for(int i=0; i<words.length;i++)
            System.out.println(words[i]);


        for(String x : words)
            System.out.print(x);
    }
}
