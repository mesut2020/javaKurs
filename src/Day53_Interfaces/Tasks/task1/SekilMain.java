package Day53_Interfaces.Tasks.task1;

public class SekilMain {
    public static void main(String[] args) {
        Cember cb = new Cember();
        System.out.println("Alan : "+cb.alan(3));
        System.out.println("Cevre : "+cb.cevre(3));

        Diktortgen dd = new Diktortgen();
        System.out.println("Alan : "+dd.alan(3,4));
        System.out.println("Cevre : "+dd.cevre(3,4));

        Kare kare = new Kare();
        System.out.println("Alan : "+kare.alan(3)); // Dikdortgene extend oldu
        System.out.println("Cevre : "+kare.cevre(3));
    }
}
