package Day27_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Set5 {
    public static void main(String[] args) {
        TreeSet<Integer> digits = generateSet(); // 10 tane random rakamla doldurunuz...
        System.out.println("Digits = "+digits);
        System.out.println("Digits.size() 1 = "+ digits.size());

        addElements(digits,10,100,100);
        addElements(digits, 50);

        System.out.println("Digits = "+ digits);
        System.out.println("Digits.size() 2 = "+ digits.size());

        int[] ints = convertToArray(digits);
        System.out.println("yeni dizi = " +Arrays.toString(ints));



    }

    // set i diziye ceviren method...
    public static int [] convertToArray(TreeSet<Integer> set){
        // 1. yol
        int[] yeni = new int[set.size()];
        int i=0;
        for (Integer num : set)   //foreach ile
             yeni[i++] = num;
        return yeni;
    }

    //  set e eleman ekleme...
    public static void addElements(TreeSet<Integer> set, int... values)
    {
        for (int i = 0; i < values.length; i++) {
            set.add(values[i]);
        }
    }
    // set e random sayi ekleme...
    public static TreeSet<Integer> generateSet(){
        TreeSet<Integer> set = new TreeSet<>();

        // burada tam 10 defa doner, ama ayni degerleri set yazmayacagi icin 10 eleman olmayabilir...
//        for (int i = 0; i < ; i++) {
//            int randomNum = (int)(Math.random()*10)+1;
//            set.add(randomNum);
//        }
        //asagidaki sekilde
        while (set.size()<10) {
            int randomNum = (int)(Math.random()*90)+1;
            set.add(randomNum);
        }
        return set;
    }
}
