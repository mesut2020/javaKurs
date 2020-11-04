package Day24_ArrayList;

import java.util.Scanner;

public class PrintfAndFormat5 {
    public static void main(String[] args) {
        int a=120;
        double oran=0.25652346785;
        String str;

        System.out.println("a = " + a);
        System.out.println("oran = " + oran);

        // Formatlı yazdırmalar :  Format ve printf
        // tam sayılar içid : d
        // ondalıklı sayılar için : f  kullanılıyor

        str = String.format(" a=%d   oran=%f ", a,oran);
        System.out.println("1.str = " + str);
        System.out.println(" a="+a+" oran="+oran); // ama ben noktadan sonra 2 hane yazsın gibi yazdırmazdım

        System.out.printf("2. a=%d oran=%f , pi=%f \n", a,oran, Math.PI);
        System.out.printf("3. a=%10d oran=%f \n", a,oran); // 10d 10 hane kullan
        System.out.printf("4. a=%-10d oran=%f \n", a,oran); // 10d 10 hane kullan ama sola dayalı yaz
        System.out.printf("5. a=%010d oran=%f \n", a,oran); // 10d 10 hane kullan, ama boş halere 0 ata

        System.out.printf("6. a=%d oran=%.3f \n", a,oran); // noktadan sonra 3 hane kullan
        System.out.printf("7. a=%d oran=%.9f \n", a,oran); // noktadan sonra 9 hane kullan
        System.out.printf("8. a=%d oran=%6.1f \n", a,oran); // 6 hane kullan noktadan sonra 1 tane olsun

        int x=2;
        int y=(int)(Math.pow(x, 3));

        String s = "Hello World! 3 + 3.0 = 6";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        // check if the scanner has a token
        System.out.println("" + scanner.hasNext());

        // print the rest of the string
        System.out.println("" + scanner.nextLine());

        // check if the scanner has a token after printing the line
        System.out.println("" + scanner.hasNext());

        // close the scanner
        scanner.close();
    }

}

//        a = 120
//        oran = 0.25652346785
//        1.str =  a=120   oran=0.256523
//        a=120 oran=0.25652346785
//        2. a=120 oran=0.256523 , pi=3.141593
//        3. a=       120 oran=0.256523
//        4. a=120        oran=0.256523
//        5. a=0000000120 oran=0.256523
//        6. a=120 oran=0.257
//        7. a=120 oran=0.256523468
//        8. a=120 oran=   0.3