package Day52_Polymorphism.Polymorphism;

class Bird {
    int x=10;
    public String getName() {
        return "Unknown";
    }
    public void displayInformation() {
        System.out.println("The bird name is: "+getName());
    }
}

class UcanKus extends Bird {
    int x = 20;

    public String getName() {
        return "Ucan Kaz";
    }
}
class Peacock extends Bird {
    int x=20;
    public String getName1() {
        return "Peacock";

    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        Bird bird2 = new Bird();
        bird.displayInformation();
        bird2.displayInformation();
        System.out.println(bird.x);
        System.out.println(bird2.x);
        //System.out.println(bird.getName1());

        System.out.println(bird.getClass().getSimpleName());


    }
}