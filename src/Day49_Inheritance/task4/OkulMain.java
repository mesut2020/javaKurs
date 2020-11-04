package Day49_Inheritance.task4;

public class OkulMain {
    public static void main(String[] args) {

        LiseOgrencisi lo1 = new LiseOgrencisi("Ali", "Lise");
        LiseOgrencisi lo2 = new LiseOgrencisi("Veli", "Lise");
        IlkOgrencisi io1 = new IlkOgrencisi("Ayse", "ilk");
        IlkOgrencisi io2 = new IlkOgrencisi("Mehmet", "ilk");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io1 = " + io1);
        System.out.println("io2 = " + io2);

    }
}
