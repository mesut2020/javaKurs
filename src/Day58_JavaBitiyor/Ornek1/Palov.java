package Day58_JavaBitiyor.Ornek1;

public class Palov implements IFood {
    @Override
    public void taste() {
        System.out.println("Her yemekle gider...");
    }

    @Override
    public double ucret() {
        return 4;
    }

    void fry(){
        System.out.println("Yagla guzelce kavrulur...");
    }

    void boil(){
        System.out.println("Kaynatiliyor...");
    }
}
