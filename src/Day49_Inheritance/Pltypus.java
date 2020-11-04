package Day49_Inheritance;

class Mamal {
    public Mamal(int age){
        System.out.println("Mamal");
    }
}

public class Pltypus extends Mamal{
    public Pltypus(int age) {
        super(age);
        System.out.println("Plytpus");
    }
    public static void main(String[] args) {
        new Mamal(5);
        new Pltypus(10);
    }
}

