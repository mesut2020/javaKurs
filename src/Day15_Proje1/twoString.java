package Day15_Proje1;

import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.

        Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın

        Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
         */

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int lastIndex=str1.length()-1;

        if (str1.charAt(lastIndex)==str2.charAt(0)){
            System.out.println(str1+str2.substring(1));
        }
        else System.out.println(str1.concat(str2));


    }
}
