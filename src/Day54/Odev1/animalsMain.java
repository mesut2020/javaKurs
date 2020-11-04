package Day54.Odev1;

public class animalsMain {
    public static void main(String[] args) {
        Swallow sw = new Swallow();
        System.out.println("Kirlangic "+ sw.food());
        sw.flying();
        System.out.println("-------------");

        Cat cat = new Cat();
        System.out.println("Kedi "+ cat.food());
        System.out.println("-------------");

        Shark shark = new Shark();
        System.out.println("Kopek Baligi "+ shark.food());
        shark.sailing();
        System.out.println("-------------");

        Duck duck = new Duck();
        System.out.println("Ordek "+duck.food());
        duck.flying();
        duck.sailing();


    }
}
