package Day55_AbstractClass.ReplitAbstract.Abstract3;
import java.util.ArrayList;
import java.util.Scanner;

// Phone'u super class yapın.
//        cart isimli, String'i alarak bir static arraylist oluşturun.

//        getSum isimli, arraylist'i parametre aldığınız bir method oluşturun.
//        ve return tipi int;
//        arraylist'in içindeki bütün seçenekleri elde edin ve sayısal olmayan karakterleri(a b c... A B C...) ve özel karakterleri (.,!'^+...)
//        sonra bunları int'e çevirin.
//        tüm sayıları toplayın.

//        ismi options olan bir abstract method oluşturun.

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

//   Apple class'ın içinde;
//        Phone class'ı extend edin.

//        option method'u override edin.
//        parametre olarak 2 String vardır.

//        Eğer birinci String 64 GB ve 5.5 inch ise
//        cart arraylist'ine "$750" ekleyin.

//        Eğer birinci String 64 GB ve 6.5 inch ise
//        cart arraylist'ine "$850" ekleyin.

//        Eğer birinci String 128 GB ve 5.5 inch ise
//        cart arraylist'ine "$950" ekleyin.

//        Eğer birinci String 128 GB ve 6.5 inch ise
//        cart arraylist'ine "$1200" ekleyin.
class Apple extends Phone{
    public void options(String str1, String str2) {
        if(str1.equalsIgnoreCase("64 GB")&&(str2.equalsIgnoreCase("5.5 inch"))) cart.add("$750");
        if(str1.equalsIgnoreCase("64 GB")&&(str2.equalsIgnoreCase("6.5 inch"))) cart.add("$850");
        if(str1.equalsIgnoreCase("128 GB")&&(str2.equalsIgnoreCase("5.5 inch"))) cart.add("$950");
        if(str1.equalsIgnoreCase("128 GB")&&(str2.equalsIgnoreCase("6.5 inch"))) cart.add("$1200");
    }
}

// Samsung class'ın içinde;
//        Phone class'ı extend edin.
//        option method'u override edin.
//        parametre olarak 2 String vardır.
//
//        Eğer birinci String 256 GB ve 5.5 inch ise
//        cart arraylist'ine "$1000" ekleyin.
//
//        Eğer birinci String 256 GB ve 7.5 inch ise
//        cart arraylist'ine "$1200" ekleyin.
//
//        Eğer birinci String 512 GB ve 5.5 inch ise
//        cart arraylist'ine "$1300" ekleyin.
//
//        Eğer birinci String 512 GB ve 6.5 inch ise
//        cart arraylist'ine "$1400" ekleyin.
class Samsung extends Phone{

    public void options(String str1, String str2) {
        if(str1.equalsIgnoreCase("256 GB")&&(str2.equalsIgnoreCase("5.5 inch"))) cart.add("$1000");
        if(str1.equalsIgnoreCase("256 GB")&&(str2.equalsIgnoreCase("7.5 inch"))) cart.add("$1200");
        if(str1.equalsIgnoreCase("512 GB")&&(str2.equalsIgnoreCase("5.5 inch"))) cart.add("$1300");
        if(str1.equalsIgnoreCase("512 GB")&&(str2.equalsIgnoreCase("6.5 inch"))) cart.add("$1400");
    }
}

//  Main class'ının içinde;
//        scanner class object olustur.
//        iki adet String oluşturun str1, str2 ve scanner object'ini String'lere atayın.
//
//        apple class'ı için object oluştur.
//        options method'unu apple class'ının içine çağır.
//        options parametreleri, daha önce oluşturulan iki String'lerdir.
//
//        İki adaet String oluşturun. str3 ve str4, sonra scanner object'i bu String'lere atayın.
//        samsung class'ı için object oluşturun.
//        options method'unu samsung class'ının içinde çağırın.
//        options parametreleri daha önce oluşturulan iki String'dir.
//
//        getSum method'unu Phone class'ının içinde çağırın.
//        sonucu yazdırın.

class Main {

    public static void main(String [] args) {

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