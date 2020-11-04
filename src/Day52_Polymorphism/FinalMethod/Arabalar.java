package Day52_Polymorphism.FinalMethod;

public class Arabalar{
    public static void main(String[] args) {

        Araba araba = new Araba("Zafira");
        Tasit tasit = new Tasit("Opel");

        System.out.println(tasit); //Tasit{model='Opel'}
        System.out.println(araba); //Tasit{model='Zafira'}

    }

}
