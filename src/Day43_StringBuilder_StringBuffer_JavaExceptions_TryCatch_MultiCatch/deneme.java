package Day43_StringBuilder_StringBuffer_JavaExceptions_TryCatch_MultiCatch;

import java.util.ArrayList;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int a=10;
        int i=0;

        int b=a;
         a=20;

        do{
            Scanner sc = new Scanner(System.in);
            a= sc.nextInt();
            arr.add(a);

        } while(i++<5);

        System.out.println(arr);
    }
}
