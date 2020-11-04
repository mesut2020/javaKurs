package Day52_Polymorphism.Polymorphism.Ornek1;

public class Ciftlik {




    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("Karabas");
        Kedi kedi1 = new Kedi("Kopuk");

        kopek1.ses();
        kedi1.ses();
        kopek1.kokladi();

        Hayvan kopek2 = new Kopek("Comar");
        Hayvan kedi2 = new Kedi("Pamuk");

        kopek2.ses();
        kedi2.ses();

//        Kopek kopek3= (Kopek) kopek2;
//        kopek3.kokladi();
//        kopek3.ses();

        //kopek2.kokladi(); // Sadece subClass a ait olan field ve metodlar
        // bu tanimlama tipinde ulasilamaz...
        System.out.println("------------------");
        Hayvan.HayvanSesi(kedi1);
        Hayvan.HayvanSesi(kopek1);
    }
}

//    Kopek kopek1                 =    new Kopek("karabaş");
//    referans tipi Kopek               nesnenin tipi (instance) Kopek
//
//    Hayvan kopek2                =    new Kopek("çomar");
//    referans tipi Hayvan              nesnenin tipi Kopek