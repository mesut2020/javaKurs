package Day56.Ornek2;

public class Kedi extends Hayvan{
     static int kediSayac=0;

    Kedi(){
        kediSayac++;
    }
    @Override
    void yiyecegi() {
        System.out.println("Mama veya balik");
    }

    @Override
    void yemekMiktari() {
        System.out.println("100 gr");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("10 saat");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
