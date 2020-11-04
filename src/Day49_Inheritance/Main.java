package Day49_Inheritance;
class SuperClass {
    static String statikVar = "static variable okundu";
    String instancaVar = "instance variable okundu";

    // static initializer class ilk calistiginda Constructurdan önce 1 kez calisir
    static { System.out.println("SuperClass: static initializer, " + statikVar); }

    // instance initializer her nesne olusturulmasinda Constructurdan önce calisir
    { System.out.println("SuperClass: instance initializer, " + instancaVar); }

    SuperClass(){
        System.out.println("SuperClass: Constructor");
    }

    public static void main(String[] args) {
        System.out.println("SuperClass: Main");
    }
}

class ChildClass extends SuperClass {
    static String statikVar = "static variable okundu";
    String instancaVar = "instance variable okundu";

    static { System.out.println("ChildClass: static initializer, " + statikVar); }

    { System.out.println("ChildClass: instance initializer, " + instancaVar); }


    ChildClass(){
        System.out.println("ChildClass: Constructor");
    }

}
public class Main {
    static {
        System.out.println("ne zaman calsiacka bakalim");
    }
    public static void main(String[] args) {
        System.out.println("Main basladi.");
        System.out.println("Nesne-1 olusturulacak.");
        new ChildClass();
        System.out.println("Nesne-1 olusturuldu.");
        System.out.println("Nesne-2 olusturulacak.");
        new ChildClass();
        System.out.println("Nesne-2 olusturuldu.");
        System.out.println("Main bitti.");
    }
}
