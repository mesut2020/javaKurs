package Day23_Java_Methods;

public class JavaMethods3 {
    // OVERLOADING... Method isimlerinin ayni olma durumu.
    // Degisken sayisi ve tipine gore Java kendisi methodu buluyor...
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        int num3 = 78;
        // parametrelerin tip sirasi farkli oldugunda da ayni isim kulanilabilir...
        int result = total(num1,num2);
        int result2 = total(num1,num2,num3);

        double dnum1 = 5.2;
        double dnum2 = 7.4;

        double result3 = total(dnum1,dnum2);
        /******************************/
        // parametrelerin tip sirasi ayni oldugunda da ayni isim kullanilabilir...
        UserInfo(42, "Mesut");
        UserInfo("Mesut",42);

        System.out.println(total(num1,num2)); // degisken sayisina gore o mthoda gider
        System.out.println(total(num1,num2,num3));

        System.out.println(result3);

    }

    public static void UserInfo(int age, String name)
    {
        System.out.println(name+ " " +age);
    }

    public static void UserInfo(String name,int age)
    {
        System.out.println(name+ " " +age);
    }

    public static double totalDI(double x, double y)
    {
        return x+y;
    }
    public static double total(double x, double y)
    {
    return x+y;
    }
    public static int total (int x, int y)
    {
        return x+y;
    }

    public static int total(int x, int y, int z)
    {
        return x+y+z;
    }

}
