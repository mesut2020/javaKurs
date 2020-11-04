package Day48_Inheritance.Extends2;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan("yok", 0, "Genel");
        hayvan.konustu();

        Kopek kopek = new Kopek("beyaz", 10, "kopek");
        kopek.konustu();

        Kus kus = new Kus("gri", 1, "Kus");
        kus.konustu();

//        Hayvan kopek2 = new Kopek("siyah", 5, "Kangal");
//        System.out.println("kopek2.kilo = " + kopek2.kilo);
//        kopek2.konustu();


    }
}
