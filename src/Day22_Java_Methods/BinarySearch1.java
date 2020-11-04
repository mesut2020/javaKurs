package Day22_Java_Methods;

import java.util.Arrays;

public class BinarySearch1 {
    public static void main(String args[]){
            int arr[] = {10,20,30,40,50};
            int arr2[] = {40,50,60,70};
            int key = 80;
            int result = Arrays.binarySearch(arr,arr2[3]);
            if (result < 0)
                System.out.println("Element is not found!"+result);
            else
                System.out.println("Element is found at index: "+result);
        }

}
