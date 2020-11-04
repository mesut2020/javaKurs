package Day14_Loop;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        //Girilen 10 adet sayıdan tek olanları ve çift olanların miktarlarını
        // ayrı ayrı bularak yazdırınız.

        Scanner sc = new Scanner(System.in);
        int oddNum=0;
        int evenNum=0;
        int counter=0;
        do {
            System.out.print("Enter a number= ");
            int num = sc.nextInt();

            if(num%2==1) oddNum++;
            else evenNum++;
            counter++;
        } while (counter < 10);
        System.out.println("Number of Even =" + evenNum);
        System.out.println("Number of Odd =" + oddNum);
    }
}
