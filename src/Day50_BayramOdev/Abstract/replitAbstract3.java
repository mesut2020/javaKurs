package Day50_BayramOdev.Abstract;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Phone{
    static ArrayList<String> cart = new ArrayList<>();

    public static int getSum(ArrayList<String> cart){
        int sum=0;
        for (String str: cart) {
            str=str.replaceAll("[^0-9]","");
            int num = Integer.parseInt(str);
            sum+=num;
        }
        return sum;
    }

    public abstract void options(String str1, String str2);

}

class Apple extends Phone{

    @Override
    public void options(String str1, String str2) {
        if(str1.equalsIgnoreCase("64 GB")&&(str2.equalsIgnoreCase("5.5 inch"))) cart.add("$750");
        if(str1.equalsIgnoreCase("64 GB")&&(str2.equalsIgnoreCase("6.5 inch"))) cart.add("$850");
        if(str1.equalsIgnoreCase("128 GB")&&(str2.equalsIgnoreCase("5.5 inch"))) cart.add("$950");
        if(str1.equalsIgnoreCase("128 GB")&&(str2.equalsIgnoreCase("6.5 inch"))) cart.add("$1200");

    }
}

class Samsung extends Phone{

    @Override
    public void options(String str1, String str2) {
        if(str1.equalsIgnoreCase("256 GB")&&(str2.equalsIgnoreCase("5.5 inch"))) cart.add("$1000");
        if(str1.equalsIgnoreCase("256 GB")&&(str2.equalsIgnoreCase("7.5 inch"))) cart.add("$1200");
        if(str1.equalsIgnoreCase("512 GB")&&(str2.equalsIgnoreCase("5.5 inch"))) cart.add("$1300");
        if(str1.equalsIgnoreCase("512 GB")&&(str2.equalsIgnoreCase("6.5 inch"))) cart.add("$1400");
    }
}



public class replitAbstract3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        Apple apple = new Apple();
        apple.options(str1, str2);

        String str3 = sc.nextLine();
        String str4 = sc.nextLine();

        Samsung samsung = new Samsung();
        samsung.options(str3,str4);

        System.out.println(Phone.getSum(Phone.cart));

    }
}
