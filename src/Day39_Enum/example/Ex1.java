package Day39_Enum.example;

import java.util.ArrayList;

public class Ex1 {

    static final String name="Maximilian";

    static final ArrayList<String> list=new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Replace = " + name.replace("i","o")); // name = Maxomolloan
        System.out.println("1.name = " + name);

//        name = name.replace("i","o");
//        System.out.println("2.name = " + name);


        list.add("Ahmet");
        list.add("Alperen");
        System.out.println("Önce list.toString() = " + list.toString());

//        list=new ArrayList<>(); // final olduğunda sadece yeniden oluşturmaya izin vermiyor, diğer işlemler yapılabilir.
//        System.out.println("Sonra list.toString() = " + list.toString());

    }

    // Static bir metodun içinde metodun dışından kullanacağınız her şey static veya
    // new ile yeni oluşturulmuş olmalı.Sebebi: Static bir canlı bir yapı
    // olduğundan içind ekullanılanlarda o anda erişilebilir canlı yani
    // static olomalı.


}