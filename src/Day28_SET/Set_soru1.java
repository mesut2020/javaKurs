package Day28_SET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_soru1 {
    public static Set<Integer> generateSet()
    {
        // 1.Yöntem
        Set<Integer> hs=new HashSet<>(Arrays.asList(1,2,3,4,5,5,5,6,7,8));

        //2.Yöntem
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);

        return hs;
    }

    public static void AddElements(Set<Integer> hs, int... sayilar){

        for (int i = 0; i <sayilar.length ; i++) {
            hs.add(sayilar[i]);
        }
    }

    public static int[] convertToArray(Set<Integer> hs){
        // String[] arrayString = set.toArray(new String[set.size()]);
        //int[] arr1 = hs.toArray(new Integer[hs.size()]);
        int [] arr1 = new int[hs.size()];
        int i=0;
        for (int n:hs) {
            arr1[i++] = n;
        }
        return arr1;
    }

    public static ArrayList<Integer> convertToArrayList(Set<Integer> hs) {
        ArrayList<Integer> arrList1 = new ArrayList<>(hs);
        return arrList1;
    }

    // metoda gönderilen değerler primitive yani temel değişkenler değilse, yani referans değişkenler ise,
    // metodda yapılan değişiklik bu değişkenin kendisinde yapıldığından, main de de değişiklik aynen görülür.
    public static void main(String[] args) {
        // Create method that generates a HashSet of
        // given numbers [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
        // bu işlemi generateSet() metodunda yapınız.
        Set<Integer> hs=generateSet();
        System.out.println("hs = " + hs); // hs = [1, 2, 3, 4, 5, 6, 7, 8]

        // -Sonra AddElements şeklind ebir metodlar 1 veya 1 den fazla sayı eklenebilen metodu
        // yazınız.
        AddElements(hs, 12,14);
        AddElements(hs, 1,2,3,4,5,101,102,103);
        AddElements(hs,65);
        System.out.println("AddElemnet sonrası hs = " + hs); // [1, 65, 2, 3, 4, 5, 101, 6, 102, 7, 103, 8, 12, 14]

        // -Sonra oluşmuş olan maindeki hashSet i convertToArray isimli bir metoda göndererek
        // main de bir Array e eşitleyiniz.
        int [] arr = new int[hs.size()];
        arr = convertToArray(hs);
        System.out.println("Array = " +Arrays.toString(arr));

        // -Sonra oluşmuş olan maindeki hashSet i convertToArrayList isimli bir metoda göndererek
        // main de bir ArrayList e eşitleyiniz.
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList = convertToArrayList(hs);
        System.out.println("ArrayList = " +arrList);

    }
}