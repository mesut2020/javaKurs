package Day25_Proje3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Method5_updateRange {

    public static int[] URange(int[] numArr, int num1, int num2){

        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i]>num1 && numArr[i]<num2) numArr[i]=-1;

        }
        return numArr;
    }

    public static void main(String[] args) {
         /*UpdateRange
    URange isminde bir metod yazınız,
    Bu metod parametre olarak int Array ve 2 adet int almalı.
    Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
    rakamlar arasında olanlarına -1 değerini atasın.oluşan yeni diziyi göndersin.main de yazdırınız.

            Örnek:
    int array = 1,6,12,15,22,18,30,16
    int 1 = 10
    int 2 = 20
    sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.*/

        Scanner sc = new Scanner(System.in);

        int[] numArr= {1,6,12,15,22,18,30,16};
        System.out.println(Arrays.toString(numArr));

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(Arrays.toString(URange(numArr, num1,num2)));

    }

}
