package Day13_IfElse;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {

        //Kullanicidan Fizik: 90 seklinde not bilgisi aliniz
        //>90 icin A, >80 icin B, >70 C, >60 D, >40 E, <40 F

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Bir sayi girin =");
        String y=sc.nextLine();

        //int x = Integer.parseInt(y.substring(y.indexOf(" ")+1));

        int x = Integer.parseInt(y.replaceAll("[^0-9]", ""));

        if (x>=90)
            System.out.println("A");
        else if(x>=80)
            System.out.println("B");
        else if(x>=70)
            System.out.println("C");
        else if(x>=60)
            System.out.println("D");
        else if(x>=40)
            System.out.println("E");
        else
            System.out.println("F");


    }
}
