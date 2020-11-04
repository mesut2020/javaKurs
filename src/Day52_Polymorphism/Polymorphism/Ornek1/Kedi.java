package Day52_Polymorphism.Polymorphism.Ornek1;

public class Kedi extends Hayvan {

    public Kedi(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("Miyavladi...");
    }

}
