package Day19_Array;

import java.util.Arrays;
import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
        // "$12 $23 $10 $2 $5 $2" bu sayialrin topamini bulunuz...

        Scanner sc= new Scanner(System.in);

        String strNum=sc.nextLine(); // sayilar arlarinda bosluk ve $ isareti ile string olarak girilecek...

        String [] strNumArr=strNum.split("[ ]+"); // arlarinda ne kadar bosluk olursa olsun, bosluklari silip, bosluga gore her sayiyiyi diziye atar $ isareti ile birlikte...

        System.out.println(Arrays.toString(strNumArr)); // Bosluklari alinip olusturulan diziyi yazdir...

        int[] numArr = new int[strNumArr.length]; // integer bir dizi olustur...

        int total=0;

        for (int i = 0; i < strNumArr.length; i++)
        {
        numArr[i]=Integer.parseInt(strNumArr[i].substring(1));  // substring ile $ isaretini, daha dogrusu 0. indexi atlayip kalan sayiyi integere a cevirip diziye at...
        total+=Integer.parseInt(strNumArr[i].substring(1)); // dizideki sayilari topla...
        }

        System.out.println(Arrays.toString(numArr));
        System.out.println(total);

        String repl1 = "abcdefabcdef".replaceAll("..(?!$)", "$0/"); // nakta sayisi kadar karakterden sonra / isareti koyar... ab/cd/ef/ab/cd/ef
        System.out.println(repl1.toString());

        String aString= "abcdefabcdef";
        String[] arr=aString.split("(?<=\\G.{3})"); // 3 karakter alip diziye atar... [abc, def, abc, def]
        System.out.println(Arrays.toString(arr));

        String repl2 = "210620".replaceAll("..(?!$)","$0."); // 21.06.20
        String[] repl3="210 605 61".split(" "); //[210, 605, 61]
        System.out.println(repl2.toString());
        System.out.println(Arrays.toString(repl3));



    }
}
