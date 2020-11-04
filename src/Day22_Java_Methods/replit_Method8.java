package Day22_Java_Methods;

import java.util.Arrays;
import java.util.Scanner;


public class replit_Method8 {
    public static void main(String[] args) {

/*        nextGreaterElement isminde bir method oluşturun.
                Parametre olarak iki int array'i kabul eder.
        Size int nums1 adında bir int array verilir ve bunun altkümesi olarak da nums2 array verilir.
                nums2 array'indeki nums1 ögelerini arayın ve ortak olan ögeden sonra gelen numaranın, nums2 array'inde bulunan sayıdan büyük olup olmadığını kontrol edin. Eğer öyle ise, bu sayının yerini nums2 deki büyük sayı ile değiştirin.nums2 array'inde, bulunan sayıdan sonra gelen başka bir sayı yoksa, o yer için -1 koyun.
        Örnek ile daha iyi anlayacaksınız.
                Example 1:
        Girdi: nums1 = [4,1,2], nums2 = [1,3,4,2]
        Çıktı:[-1,3,-1]
        Açıklama:
        İlk dizedeki 4 sayısı için, ikinci dizede (array'deki) bir sonraki büyük sayı yoktur, bu nedenle -1 yazılır.
        İlk dizedeki 1 sayısı için, ikinci dizede 1'den sonra gelen büyük sayı 3 tür.
        İlk dizedeki 2 sayısı için, ikinci dizede 2'den sonra gelen büyük bir sayı yoktur, bu nedenle -1 yazılır.

         Example 2:
        Girdi: nums1 = [2,4], nums2 = [1,2,3,4].
        Çıktı: [3,-1]
        Açıklama:
        İlk dizedeki 2 sayısı için, ikinci dizede 2'den büyük olarak 3 gelmektedir. Bu nedenle 3 'tür.
                İlk dizedeki 4 sayısı için, ikinci dizede 4'ten sonra hiçbir sayı gelmediği için, -1 yazılır.

        Not:  Sayı1 ve sayı2'deki tüm öğeler benzersizdir.
        */


        Scanner oku = new Scanner(System.in);
        System.out.println("sayi gir");
        String[] sayigir = oku.nextLine().split(" ");
        System.out.println("sayi gir");
        String[] sayigir2 = oku.nextLine().split(" ");
        int[] nums1 = new int[sayigir.length];
        int[] nums2 = new int[sayigir2.length];
        for (int i = 0; i < sayigir.length; i++) {
            nums1[i] = Integer.valueOf(sayigir[i]);
        }
        for (int i = 0; i < sayigir2.length; i++) {
            nums2[i] = Integer.valueOf(sayigir2[i]);
        }

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] yenidizi = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++)
        {
            for (int j = 0; j < nums2.length ; j++)
            {
                if (nums1[i] == nums2[j])
                {
                    if (j==nums2.length-1) yenidizi[i] =-1;
                    else if (nums2[j+1]>nums1[i]) yenidizi[i] = nums2[j+1];
                    else yenidizi[i] = -1;
                }
            }
        }

        return yenidizi;
    }
}
