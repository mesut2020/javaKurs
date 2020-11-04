package Day52_Polymorphism.FinalMethod;

public class Tasit {
    private String model;

    public Tasit(String model) {
        this.model = model;
    }

    @Override
    public  final String toString() {
        return "Tasit{" +
                "model='" + model + '\'' +
                '}';
    }
}
