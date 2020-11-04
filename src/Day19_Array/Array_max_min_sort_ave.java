package Day19_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_max_min_sort_ave {

    public static void main(String[] args) {
        // girilen bir sitringin max, min ve ortadaki sayiyi bulunuz...
        // eleman sayisi tek ise ortadaki sayi
        // eleman sayisi cift ise ortadaki iki sayinin ortalamasi...

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayilari string olarak giriniz: ");
        String str= sc.nextLine();

        String[] strNum= str.split("[ ]+");

        int[] num=new int[strNum.length];

        for(int i=0; i<strNum.length; i++)
            num[i]=Integer.parseInt(strNum[i]);

        Arrays.sort(num);

        int max = num[strNum.length-1];
        int min = num[0];

        double centerValue;

        if(strNum.length%2==0) centerValue=((num[strNum.length/2-1]) + num[strNum.length/2]) / 2.0 ; // 2.0 yerine 2 yazarsan bolen ve bolunen integer oldugu icin sonuc her zaman tam sayi cikiyor. Mesela 2 ve 3 icin 2.5 yerine 2.0 cikiyor...
        else centerValue=num[(strNum.length-1)/2];



        System.out.println("Girilen string : " +Arrays.toString(strNum) );
        System.out.println("Sirali dizi : " +Arrays.toString(num));

        System.out.println("MAX: " +max);
        System.out.println("MIN : " + min);
        System.out.println("CENTER VALUE : " +centerValue);


    }
}
