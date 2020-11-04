package Day5_JavaTypeCasting;

import java.util.Arrays;

public class TypeCasting2 {
    public static void main(String[] args) {
        // iki double olusturup deger atayin...
        // double degiskenini short degiskene atayin...
        // butun degerleri ekrana yazdirin...

        double db1 = 33000.6;
        double db2 = -32790.0;

        short sh1 = (short) db1;
        short sh2 = (short) db2;


        System.out.println("db1 = " + db1);
        System.out.println("db2 = " + db2);
        System.out.println("sh1 = " + sh1);
        System.out.println("sh2 = " + sh2);


    }
}
