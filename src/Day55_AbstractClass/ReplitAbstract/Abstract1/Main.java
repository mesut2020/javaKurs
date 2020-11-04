package Day55_AbstractClass.ReplitAbstract.Abstract1;

public class Main {

//    main class'ın içinde
//
//    Tigers için bir object oluşturun
//    ve bu talking methodunu çağırınız.
//    Sonra walking methodunu çağırınız.
//
//    Lions için bir object oluşturun
//    ve bu talking methodunu çağırınız.
//    Sonra walking methodunu çağırınız.
//
//    HoemCats için bir object oluşturun
//    ve bu talking methodunu çağırınız.
//    Sonra walking methodunu çağırınız.
//
//    Not: Yazdırılacak şeyler 1e1 şekilde yazılmalıdır. Yoksa kod hata verecektir.


    public static void main(String[] args) {
        Tigers tiger = new Tigers();
        tiger.talk();
        tiger.walk();

        Lions lion = new Lions();
        lion.talk();
        lion.walk();

        HomeCats homeCat = new HomeCats();
        homeCat.talk();
        homeCat.walk();

    }
}
