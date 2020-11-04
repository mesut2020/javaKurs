package Day56.Ornek2;

public class Kartal extends Hayvan{
     static int kartalSayac=0;

    Kartal(){
        kartalSayac++;
    }
    @Override
    void yiyecegi() {
        System.out.println("Et");
    }

    @Override
    void yemekMiktari() {
        System.out.println("gunde bir kus");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("8 saat");
    }

    @Override
    void sesi() {
        System.out.println("ciyak");
    }
}
