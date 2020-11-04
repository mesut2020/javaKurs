package Day36_Constructors.tasks.task1;

public class Task1 {
    // Ayri bir Book class i yazinis: fields: name, publishYear,autor
    // 3 adet Constructor ekleyin
    // kitaplarin ozelliklerini tek bir satirda yazdiran bir metod yazin...
    // 3 adet kitabi farkli metodlarla olusturup

    public static void main(String[] args) {

        Book kitap1 = new Book("Mein Sommer mit Mia", 2014, "Karsten Stollwerck");
        Book kitap2= new Book("Kel Oglan", 1950);
        Book kitap3 = new Book();
        kitap3.name="Sessiz Gemi";

        kitap1.showInfo();
        kitap2.showInfo();
        kitap3.showInfo();
        
        
        int sayi = 5;
        System.out.println(sayi); // toString yapiyor atomatik olarak...

        System.out.println("kitap1.toString() = " + kitap1.toString());
        System.out.println(kitap1);
        System.out.println(kitap2);
        System.out.println(kitap3);

    }

    
}
