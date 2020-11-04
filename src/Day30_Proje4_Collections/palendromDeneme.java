package Day30_Proje4_Collections;

public class palendromDeneme {

    public static int returnNum(int number) {

        String strNum= String.valueOf(number);

        String strRevNum="";

        for (int i = strNum.length()-1; i >=0; i--)
            strRevNum+= strNum.charAt(i);

        int revNum= Integer.parseInt(strRevNum);

        return revNum;
    }

    /*public static int palindromeNum(int num) {

        int total = num; //349 -> 3   847 -> 4
        int revTotal=returnNum(total); //943

        int counter = 0;

        do{
            counter++;

            System.out.print("Counter: " +counter + ". " +total+ " + " +revTotal+" = ");

            total+=revTotal;

            System.out.println(total);

            revTotal = returnNum(total);
            if (total == revTotal)
                return counter;

        }while (total!=revTotal);

        return counter;
    }*/

    public static int palindromeNum(int num) {
        int count = 0;

        while (num != returnNum(num)) {
            num += returnNum(num);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // 847 -> 4 cikiyor...
        /*
        847     748      1595
        1595    5951     7546
        7546    6457     14003
        14003   30041    44044

        sayac =4*/
        System.out.println("counter ="+ palindromeNum(825));

        char ch=36;
        int a = '€';
        System.out.println(ch);
        System.out.println(a);




    }
}
