package Day38_AccessModifiers.nonAccessModifier.staticModifier;

public class Simple {
    int a;          // olusturulacak her bir nesnenin kendi degiskeni
    static int b;   // bu static anahtari ile sinifin bir degiskeni oluyor.

    void increase (){
        a++;
        b++;
    }

    public static void main(String[] args) {
        Simple ornek1 = new Simple();
        ornek1.a = 5;

        Simple ornek2 = new Simple();
        ornek2.a = 7;

        Simple.b = 5;

        Simple.b = 9;

        ornek1.increase();  // ornek1.a = 6;  Simple.b =10
        ornek2.increase();  // ornek2.a = 8;  Simple.b = 11

        // Su anda a ve b nin degerleri kactir;
        System.out.println("ornek1.a = " + ornek1.a);
        System.out.println("ornek2.a = " + ornek2.a);
        System.out.println("Simple.b = " + Simple.b);




    }
}
