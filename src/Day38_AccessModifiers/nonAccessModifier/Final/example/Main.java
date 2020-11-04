package Burak.Non_AccessModifiers.Final.example;

public class Main {
    public static void main(String[] args) {

        //buna örnek olarak banka hesapları, site kullanıcıları...
        System.out.println("Kullanıcının username'i: " + database.username);
        System.out.println("Kullanıcının password'u: " + database.password);
        System.out.println("Kullanıcının kayıt tarihi: " + database.registerDate);

        //database.username = "brkturkmen"; //değiştiremiyoruz.

    }
}
