package Day19_Array;

import java.util.Arrays;

public class Array_6 {

    public static void main(String [] args){

        //" $10    $ 20         €5    €  10    "

        String str=" $ 10    $ 20         €5    €  10  ";
        //str=str.replaceAll("€","");
        str = str.replaceAll(" ","");
        System.out.println(str);

        String [] dizi=str.split("[$||€]");

        System.out.println(Arrays.toString(dizi));

        int sum=0;
        for (int i=1;i<5;i++)
            sum=sum+Integer.parseInt(dizi[i]);
        System.out.print(sum);

    }
}
