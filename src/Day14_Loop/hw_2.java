package Day14_Loop;


import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        // bilgisayar 0-10 arası sayı tutsun(Random).
        // Kullanıcıdan en fazla 3 hak vererek sayıyı bulmasını isteyiniz.
        // Bulduğunda tebrikler yazsın.

        int rand= (int) (Math.random()*10+1);

        Scanner sc= new Scanner(System.in);
        int guess, numGuess = 0;

        System.out.println("Enter a number between 0-10");
        do {
            System.out.print(numGuess++ +". guess= ");
            guess= sc.nextInt();
            if (guess==rand) {
                System.out.println("Well done...");break;
            }
            else if (guess < rand) System.out.println("Your guess is too small...");
            else System.out.println("Your guess ist too big...");
        } while(numGuess < 3);
        if (guess!=rand) System.out.println("Answer is " +rand+", try again...");

    }
}