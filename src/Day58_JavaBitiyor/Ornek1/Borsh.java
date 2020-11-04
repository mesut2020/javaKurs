package Day58_JavaBitiyor.Ornek1;

public class Borsh implements IFood {
    @Override
    public void taste() {
        System.out.println("Daha once hic yememistim...");
    }

    @Override
    public double ucret() {
        return 7;
    }

    void boil(){
        System.out.println("Kaynatiliyor...");
    }
    void eatTomorrow(){
        System.out.println("Bugun sabret, yarin daha guzel olacak...");
    }
}