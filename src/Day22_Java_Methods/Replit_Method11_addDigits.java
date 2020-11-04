package Day22_Java_Methods;

public class Replit_Method11_addDigits {

    public static int addDigits(int num){
        int sum=0;
        //int sum1=0;
        while(num!=0)
        {
            sum+=num%10;
            num/=10;
        }

        if (sum>=10)  sum=addDigits(sum); // Recursive: method un icinde methodu tekrar baslatir.

        /*else {
            while (sum != 0) {
                sum1 += sum % 10;
                sum /= 10;
            }
        }*/
        return sum;

    }

    public static int addDigitsRecursive(int num){
        int sum=0;

        if(num!=0)
        {
            sum+=num%10;
            num/=10;
            addDigitsRecursive(num);
        }

        if (sum>=10)  sum=addDigits(sum); // Recursive: method un icinde methodu tekrar baslatir.


        return sum;

    }

    public static void main(String[] args) {

        System.out.println(addDigitsRecursive(38));

    }
}
