package Day22_Java_Methods;

import java.util.Arrays;

public class ReplitMethod14 {

    public static int[] append(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i=0; i<arr1.length; i++)
            arr3[i] = arr1[i];

        for (int i=arr1.length; i<arr1.length+arr2.length; i++)
            arr3[i] = arr2[i-arr1.length];

        return arr3;
    }

    public static void main(String[] args) {
// append adında bir method oluşturun.
//Parametre olarak iki int array  oluşturun.
// ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
// Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
//Bunu döndürmelidir:   {2, 4, 6, 1, 2, 3, 4, 5}.
        int[] arr1 = {2, 4, 6};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(append(arr1,arr2)));
    }
}
