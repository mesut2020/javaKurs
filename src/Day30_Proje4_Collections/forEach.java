package Day30_Proje4_Collections;

import java.util.ArrayList;
import java.util.List;

public class forEach {

    public static int digitSum(int n){
        int total=0;
        while (n!=0){
            total+=n%10;
            n/=10;
        }
        return total;
    }

    public static int revNum(int n){
        String str="";
        while (n!=0){
            str+= Integer.toString(n%10);
            n/=10;
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};

        int[][] arr2d= {{1,2},{4,5}};

        ArrayList<Integer> arrList = new ArrayList<>(List.of(12,34,56,87,98));

        for (Integer n:arr1) {
            System.out.println("nArr = " + n);
        }
        int i=0;
        int j=0;

        for (int n: arr2d[i++]) {
            for (int m:arr2d[j++] ) {
                System.out.println("n2d = " + m );
            }
        }
        int total =0;
        for (int n: arrList) {
            System.out.println("nList = " + n);
            System.out.println("digitSum = " + digitSum(n)); total=0;
            System.out.println();
            System.out.println("Sayinin tersi = " + revNum(n));
            System.out.println("toplami = " + digitSum(revNum(n)));
            System.out.println();
        }
    }
}
