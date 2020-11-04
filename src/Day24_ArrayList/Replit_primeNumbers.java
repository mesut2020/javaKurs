package Day24_ArrayList;

import java.util.Scanner;

public class Replit_primeNumbers {
    public static void main(String[] args) {

                // code start here
                Scanner sc = new Scanner(System.in);

                int n= sc.nextInt();

                int prime=1;
        //System.out.println("Prime numbers = "+ 2 );
                for(int i=3; i<=n;i++) {
                    int c=0;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) c++;
                    }if(c==0) {
                        prime++;
                        //System.out.println(i); // prime number lari yazar...
                    }
                }
        System.out.println();
                System.out.println(prime+" adet var");

    }
}
