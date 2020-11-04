package Day18_Array;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        // 5 elemanli bir dizi tanimlayiniz.
        // kullanicidan degerleri alarak bu diziyi doldurunuz.
        // ortalamadan buyuk eleman sayisini bulunuz...

        Scanner sc = new Scanner(System.in);
        int total=0;
        double ave=0;
        int a=0;

        int[] num=new int[5];

        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
            total+=num[ i];
        }

        ave=total/num.length;

        for(int i=0;i<num.length;i++)
        {
            if (num[i]>ave)
                a++;
        }
        System.out.println(a);

    }
}
