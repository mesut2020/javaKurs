package Day56.Ornek1;

class C{
    public C(){
        System.out.println("C ");
    }
}
//Constructur da ilk cagrilan super constructor olmali. Aksi takdirde compile hatasi verir.
class B extends C{
    public B(){
        //super();  yandaki metod yazılsa da yazılmasa da Önce super Constructor cagriliyor
        System.out.println("B ");
    }
}

class A extends B{
    public A(){
        //super();  yandaki metod yazılsa da yazılmasa da Önce super Constructor cagriliyor
        System.out.println("A ");
    }
}

public class Ornek1 {
    public static void main(String[] args) {
        A a=new A();
    }
}
