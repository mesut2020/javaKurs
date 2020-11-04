package Day22_Java_Methods;

public class JavaMethods2 {

    public static void merhabaYaz()    {
        System.out.println("Merhaba");
    }

    public static void ismeMerhabaYaz(String name)    {
        System.out.println("Merhaba "+ name);
    }

    public static void main(String[] args) {
       merhabaYaz();
        String str="Rudesheim";
       ismeMerhabaYaz("Mesut");
       ismeMerhabaYaz("Özlem");
       ismeMerhabaYaz(str);

    }
}
