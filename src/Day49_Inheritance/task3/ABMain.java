package Day49_Inheritance.task3;

public class ABMain {
    public static void main(String[] args) {
        
        A a= new A();
        System.out.println("A.mesaj = " + A.mesaj);

        B b = new B();
        System.out.println("b olusturudugunda = " + B.mesaj);
        // B yi olusturdugumuz anda, mesaj = "B den merhaba"; oluyor.
        System.out.println("B den sonra a nin durumu = " + A.mesaj);

    }
    
}
