package Day4_String;

import java.util.Scanner;

public class hasNext {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */

        String str1=" 1 \n" ;
        String str2="2 dunya";

        Scanner sc = new Scanner (str1+str2);
        boolean str3=sc.hasNextInt();
        System.out.println(str3);
        int n=1;
        while(sc.hasNext())
            System.out.println(n++ +" "+sc.nextLine());
//        System.out.println(sc.nextInt());
//        System.out.println(sc.next());
//        System.out.println(sc.next());
        sc.close();



    }
}
