package Day28_SET;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mentoring2 {

    public static void elemanEkle(Set<Integer> set, int[] arr){

        for (Integer n: arr) {
            set.add(n);
        }
    }

    public static void yaz(Set<Integer> set) {
        System.out.println(set);
    }

    public static void main(String[] args) {
       /* main method altinda bos bir hashset olusturunuz.

                parametresi Integer set ve integer array ve adi elementEkle
        olan bir method yaziniz (return tipi olmayacak)

        yine set icindekileri yazdiracak ayrica bir metod daha yaziniz.
*/
        Set <Integer> set = new HashSet<>();
        int[] arr= {1,2,3,4,5};
        elemanEkle(set, arr);
        yaz(set);

    }
}
