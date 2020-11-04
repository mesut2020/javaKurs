package Day14_Loop;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        //Girilen 5 sayının toplamını ekrana yazdırınız.
        Scanner scanner = new Scanner(System.in);
       int num, total=0;
       int counter=1;

        System.out.println("Enter five numbers...");

        while (counter<=5) {
            System.out.print(counter++ +". Number = ");
            num = scanner.nextInt();
            total+=num;
        }
        System.out.println("Total = " + total);
    }
}
