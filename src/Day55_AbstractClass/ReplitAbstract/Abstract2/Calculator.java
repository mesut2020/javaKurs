package Day55_AbstractClass.ReplitAbstract.Abstract2;

import java.util.Scanner;

// Calculator'ı a super class yap.
//        super class'ın içinde;
//        calculating adında bir abstract method oluturunuz.
//        Burada iki tane int parametresi vardır.
//        return tipi int'dir.

abstract class Calculator {

    public abstract int calculating (int a, int b);

}

// Sum class'ın içinde;
//        Calculator class'ına extend et.. (uzat, bağla)
//        super class'ın içindeki calculating methodunu Override et.
//        iki parametreyi topla ve sonucu return et.
class Sum extends Calculator{

    @Override
    public int calculating(int a, int b) {
        return a + b;
    }
}

// Divide class'ının içinde,
//        Calculator class'ına extend et.. (uzat, bağla)
//        super class'ın içindeki calculating methodunu Override et.
//        iki parametreyi böl ve sonucu return et.
class Divide extends Calculator{
    public int calculating (int a, int b){
        return a/b;
    }
}

// Multiply class'ının içinde,
//        Calculator class'ına extend et.. (uzat, bağla)
//        super class'ın içindeki calculating methodunu Override et.
//        iki parametreyi çarp ve sonucu return et.
class Multiply extends Calculator{
    public int calculating (int a, int b){
        return a*b;
    }
}

// Substract class'ının içinde,
//        Calculator class'ına extend et.. (uzat, bağla)
//        super class'ın içindeki calculating methodunu Override et.
//        iki parametreyi birbirinden çıkart ve sonucu return et.
class Substract extends Calculator{
    public int calculating (int a, int b){
        return a-b;
    }
}

// Main class'ın içinde
//        scanner object oluşturunuz.
//        iki int oluştur ve bu iki int değişkenine scanner ata.
//
//        Sum methodu çağır ve sonucu yazdır.
//        Divide methodu çağır ve sonucu yazdır.
//        Multiply methodu çağır ve sonucu yazdır.
//        Substract methodu çağır ve sonucu yazdır.

class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Sum sum = new Sum();
        int x = sum.calculating(a, b);
        System.out.println(x);

        Divide div = new Divide();
        System.out.println(div.calculating(a, b));

        Multiply mul = new Multiply();
        System.out.println(mul.calculating(a, b));

        Substract sub = new Substract();
        System.out.println(sub.calculating(a, b));
    }
}

