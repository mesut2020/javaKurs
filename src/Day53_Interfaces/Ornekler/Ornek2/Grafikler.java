package Day53_Interfaces.Ornekler.Ornek2;

public class Grafikler {
    public static void main(String[] args) {
        // Bir interface den bir cok class implements yapabilir.
        // Bir class da bir den fazla interface e implements olabilir...
        Cember cember = new Cember();
        Diktortgen dg= new Diktortgen();

        cember.ciz();
        dg.ciz();

        // Interface lerden nesne uretiemez fakat referans tipi olusturulabilir.
        // Bu bize polymorfizm sagladi
        ICizilebilir cember2 = new Cember();
        cember2.ciz();
    }

}
