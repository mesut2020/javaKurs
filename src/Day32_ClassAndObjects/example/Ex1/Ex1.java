package Day32_ClassAndObjects.example.Ex1;

class Person{

    String name;
    String surname;
    int age;
    // class in altinda metod yazmak icin;
    // public static i siliyoruz
    void infoPrint(){
        System.out.println("pers.name = " + name);
        System.out.println("pers.surname = " + surname);
        System.out.println("pers.age = " + age);
    }

    int getBirthYear(){
        return 2020 - age;
    }
    
    String getInitials(){
        return name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0)+".";
    }
}

public class Ex1 {
    // 1. adim: Person isimli bir class yazınız:fields: name, surname, age; olsun.
    // 2. adim: main de 2 tane bu sınıftan nesne oluşturup değer atayınız.
    // 3.Adım  :getBirthYear isminde Person a ait bir metod yazınız, çalıştığında kişinin doğum yılını versin.
    // 4. Adim: getInitials isminde kisinin adinin ilk harfi.soyadi seklinde yazilacak metod
    //  ornek: ahmet demir -> A.D.


    // 2. yontem
    public static void infoPrint (Person pers){
        System.out.print("metod.name = " + pers.name);
        System.out.print(" metod.surname = " + pers.surname);
        System.out.println(" metod.age = " + pers.age);
    }

    

    public static void main(String[] args) {
        Person person1= new Person();

        person1.name = "Yusuf";
        person1.surname= "Yilmaz";
        person1.age = 35;

        Person person2= new Person();
        person2.name = "Ayse";
        person2.surname= "Demir";
        person2.age = 30;

        System.out.println("*** Metod olarak yazdirdik ***");
        infoPrint(person1); // bu yontemde parametrre gondermek zorundayim
        infoPrint(person2);

        System.out.println();

        System.out.println("*** Metodu class a yazdik ***");
        person1.infoPrint(); // parametre class da oldugu icin, bilgi gonderemem gorek yok.
        person2.infoPrint();

        System.out.println("person1.getBirthYear() = " + person1.getBirthYear());
        System.out.println("person2.getBirthYear() = " + person2.getBirthYear());

        System.out.println("person2 = " + person1.getInitials());
        System.out.println("person2.getInitials() = " + person2.getInitials());

    }

}
