package Day55_AbstractClass;

public class Deer {
    public Deer() {
        System.out.print("Deer");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }
    private boolean hasHorns() {
        return false;
    }
    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println(","+deer.hasHorns());

        Deer d = new Deer(5);
        System.out.println();
        Reindeer r = new Reindeer(3);

    }
}

class Reindeer extends Deer {
    public Reindeer(int age) {
        super(age);
        System.out.print("Reindeer");
    }
//    public Reindeer(int age) {
//        System.out.print("Reindeer"); }
    public boolean hasHorns() { return true; }
 }
