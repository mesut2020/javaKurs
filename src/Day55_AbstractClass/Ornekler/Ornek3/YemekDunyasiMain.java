package Day55_AbstractClass.Ornekler.Ornek3;

public class YemekDunyasiMain {
    public static void main(String[] args) {
        Baklava baklava = new Baklava();
        baklava.madeIn();
        baklava.taste();

        CheeseCake cake = new CheeseCake();
        cake.madeIn();
        cake.taste();

        GreekSalad gSalad = new GreekSalad();
        gSalad.madeIn();
        gSalad.taste();

        SezarSalad sSalad = new SezarSalad();
        sSalad.madeIn();
        sSalad.taste();


    }
}
