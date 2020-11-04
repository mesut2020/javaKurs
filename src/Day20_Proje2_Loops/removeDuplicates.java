package Day20_Proje2_Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class removeDuplicates {

    /*
        Given int array

        remove the duplicated values from the array

        print non-duplicated array length

        for example:

        Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

//1 2 2 2 3 3 3 4 4 4 5 5 5
        result should be 5

        NOTE: while printing the result dont use for loop
        use System.out.println(Arrays.toString(your_array_name));
     */


    /*
       Verilen int array

       duplicated(tekrarlanan) öğeleri array den kaldır

        non-duplicated(tekrarlanmayan) öğeleri print et

       Örnek:

       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
// aralarinda bosluk olan dizi girin
       result  [1,2,3,4,5] olmalı

       NOT: resultu print ederken for loop kullanmayın
       System.out.println(Arrays.toString(your_array_name));  kullanın
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] arr = myStr.split(" ");

        int[] useThisArray = new int[arr.length];

        for(int i = 0 ; i < useThisArray.length ; i++){

            int num = Integer.parseInt(arr[i]);

            useThisArray[i] = num;

        }

//        code start here
//        dont change anything before this line
//        your Array is useThisLine

      // Kodlamaya burdan başla.bu satırdan önceki satirlarda hicbirşeyi  degiştirme.
      //   useThisLine arrayini kullan
        int elemanSay=useThisArray.length;
        int x=0;
        int yeniElamansayisi=1;


        int a=useThisArray.length;
        int [] dizi=new int[elemanSay];

        for(int i = 0 ; i < elemanSay-1 ; i++){

            if (useThisArray[i]!=useThisArray[i+1])
            {
                dizi[x++]=useThisArray[i];
                yeniElamansayisi++;
            }
        }
        dizi[x++]=useThisArray[elemanSay-1];


        int [] dizi2=new int[yeniElamansayisi];
        for (int i =0; i<yeniElamansayisi; i++){
            dizi2[i]=dizi[i];
        }

        System.out.println(Arrays.toString(dizi2));


    }


}
