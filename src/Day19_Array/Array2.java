package Day19_Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz 5 adet meyve ismini bir diziye atadiktan sonra
        // elma ismini gecen meyveleri ekrana yaziniz...

        Scanner sc = new Scanner((System.in));
        String[] str = new String[5];


        for(int i=0; i<str.length; i++)
            str[i]=sc.nextLine();

        for(int i=0; i<str.length; i++) {
            if (str[i].toLowerCase().contains("elma"))  // stringi kucuk harfe cevir ve icinde elma gecip gecmedigine bakar.
                System.out.println(str[i]);

        }
    }
}
