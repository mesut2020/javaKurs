package Day18_Array;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        // 5 elemanli bir dizi tanimlayin.
        // 10 a kadar olan sayilardan Random atayarak doldurunuz.
        // elemanlari ekrana 3 farkli sekilde yazdiriniz...

        int[] num = new int[5];

        for(int i=0; i<num.length; i++)
        {
            num[i] = (int)(Math.random()*10);
        }

        for(int i=0; i<num.length; i++)
        {
            System.out.println(("dizi[i] = " + num[i])); // 1. yazdirma yontemi
        }

        System.out.println(Arrays.toString(num)); // 2. yazdirma yontemi

        for(int value:num)
        {
            System.out.println("value = "+ value); // 3. yazdirma yontemi
        }



    }
}

