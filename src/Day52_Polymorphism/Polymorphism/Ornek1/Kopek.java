package Day52_Polymorphism.Polymorphism.Ornek1;

public class Kopek extends Hayvan {
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("Havladi...");
    }

    public void kokladi(){
        System.out.println("Kopek kokladi...");
    }
}
