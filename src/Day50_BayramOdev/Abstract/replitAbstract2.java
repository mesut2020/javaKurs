package Day50_BayramOdev.Abstract;

import java.util.Scanner;

public class replitAbstract2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Sum sum = new Sum();
        System.out.println(sum.calculating(a,b));

        Divide div = new Divide();
        System.out.println(div.calculating(a,b));

        Multiply mul = new Multiply();
        System.out.println(mul.calculating(a,b));

        Substract sub= new Substract();
        System.out.println(sub.calculating(a,b));
    }

}

abstract class Calculator{

    public abstract int calculating (int a, int b);
}

class Sum extends Calculator{
    public int calculating (int a, int b){
        return a+b;
    }
}

class Divide extends Calculator{
    public int calculating (int a, int b){
        return a/b;
    }
}

class Multiply extends Calculator{
    public int calculating (int a, int b){
        return a*b;
    }
}

class Substract extends Calculator{
    public int calculating (int a, int b){
        return a-b;
    }
}