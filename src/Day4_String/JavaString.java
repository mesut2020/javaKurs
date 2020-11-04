package Day4_String;

public class JavaString {
    public static void main(String[] args) {

        //System.out.println("Merhaba Dünya"+"Javaya hoşgeldiniz");

        int sayi = 5;
        String ad = "ismet";
        String soyad = "temur";

        System.out.println(ad);   // ismet
        System.out.println("ad"); // ad
        // -> çift tırnak arasında yazılmayan her şey değişken kabul edilir, değeri yazılır

        System.out.println(ad+" "+soyad);
        System.out.println("ad"+"soyad");

        //int toplam = a+b;
        String fullName= ad +" "+ soyad;
        System.out.println("fullName = " + fullName);

        int yas = 45;
        String bilgi = ad + " " + soyad + " "+ yas;
        System.out.println(bilgi);

        String a = "Hallo";
        String b=a;
        String e = "Demir";
        String c= new String("Hallo");
        String d = new String ("Hallo");

        System.out.println(a+" "+b+" "+c+" "+d);

        System.out.println(a=="Hallo");
        System.out.println(a.equals(b));
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(c=="Hallo");
        System.out.println(a.equals(d));
        System.out.println(e.compareTo(a));



        
    }
}
