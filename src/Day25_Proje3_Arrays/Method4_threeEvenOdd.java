package Day25_Proje3_Arrays;

import java.util.Scanner;

public class Method4_threeEvenOdd {

    public static boolean threeEvenOrOdd (int[] numArr){
        int odd=0; int even=0;

        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i]%2==0) even++;
            else odd++;
        }

        return odd>=3 || even>=3;

    }

    public static void main(String[] args) {
                /*Soru 4:
                ThreeEvenOdd
                threeEvenOrOdd  isminde int Array paramaetre alan bir metod yazınız. Bu metod kendisine
                gönderilen Array de 3 tane çift veya 3 tane tek var ise true geri döndürsün. Yok ise
                false göndersin.
                        Örnek:
                intArray([2, 1, 3, 5]) sonuc  true olmalı
                intArray([2, 1, 2, 5]) sonuc   false olmalı
                intArray([2, 4, 2, 5]) sonuc   true olmalı */

        Scanner sc = new Scanner((System.in));
        String strNum= sc.nextLine();

        String[] strnumArr = strNum.split(" ");
        int[] numArr = new int[strnumArr.length];

        for (int i = 0; i < strnumArr.length; i++) {
            numArr[i]=Integer.parseInt(strnumArr[i]);
        }

        System.out.println(threeEvenOrOdd(numArr));

    }
}
