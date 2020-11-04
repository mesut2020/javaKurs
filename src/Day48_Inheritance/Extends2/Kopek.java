package Day48_Inheritance.Extends2;

public class Kopek extends Hayvan {

    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi); //super: super class i isaret eder.


    }
    @Override
    public void konustu(){
        //super.konustu();
        System.out.println("havladi...");
    }
}
