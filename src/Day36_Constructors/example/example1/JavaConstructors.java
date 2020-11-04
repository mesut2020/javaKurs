package Day36_Constructors.example.example1;

public class JavaConstructors {

    public static void main(String[] args) {

       /*
       //Birinci yontem...
        Student ogrenci1 = new Student();
        ogrenci1.id=1;
        ogrenci1.name= "Ayse";
        ogrenci1.surName = "Yilmaz";
        ogrenci1.sClass = 10;
        */

        // 2. Yontem de
        // Student ogrenci2 = Student.createStudent(2, "Ahmet", "Kaya", 8);

        // 3. ve esas yontem
        // nesne olusturmak ve degerlerini atamak.
        Student ogrenci3 = new Student(3, "Osman", "Dogan", 6);
        System.out.println("ogrenci3.name = " + ogrenci3.name);

        Student ogrenci4 = new Student(4, "Ayse", "Cetin");

        Student ogrenci5 = new Student(5, "Ali");

        Student ogrenci6 = new Student(6);

        Student ogrenci7 = new Student();
        ogrenci7.id=7;
        ogrenci7.name="Veli";
        ogrenci7.surName="Dmir";
        ogrenci7.sClass=7;


       Student.printOgrenci(ogrenci3);
       // System.out.println(ogrenci3.toString());
    }
}
