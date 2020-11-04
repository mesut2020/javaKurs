package Day36_Constructors.tasks.task2;

public class Task2 {
    // Bir banka class i tanimlatyin
    // 3 adet field eleyin
    // 3 adet Constructor olusturun
    // toString metodu olusturun
    // 3 tane nesne olusturup main de yazdirin


    public static void main(String[] args) {

        Bank bank1 = new Bank(1,"Sparkasse","Rudesheim/Hessen");
        Bank bank2 = new Bank(2,"VolksBank");
        Bank bank3 = new Bank();
        bank3.id=3;
        bank3.name = "Deutsche Bank";

        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println(bank3);
    }
}
