package Day22_Java_Methods;

import java.util.Arrays;

public class replit_Method7 {

    public static int[] plusOne(int[] num){

        int midDigit = num.length/2;

        num[midDigit]+=1;
        if (num[midDigit]==10) num[midDigit]=0;


        return num;

    }


    public static void main(String[] args){
       /* plusOne adında bir method oluşturun.
                Parametre olarak int alır.
        Rakamlar pozitif olmalıdır ve ilk basamak 0 olamaz.
                Yazdığınız rakamlar bir bütün olarak ele alınacaktır.
        Orta basamağa 1 ekleyin.*/

        String num1 = "12945";
        String [] strArr = num1.split("");

        int[] num = new int[strArr.length];

        for (int i=0; i<strArr.length; i++)
            num[i] = Integer.parseInt(strArr[i]);
        int[] result = plusOne(num);
        System.out.println(Arrays.toString(result));

    }
}
