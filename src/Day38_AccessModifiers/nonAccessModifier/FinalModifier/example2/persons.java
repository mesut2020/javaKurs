package Day38_AccessModifiers.nonAccessModifier.FinalModifier.example2;

public class persons {

    public static void main(String[] args) {
        Person kisi1 = new Person("Ismet", 12);
        //kisi1.fingerPrintCode = 18; // ilk degeri aldigi icin final degeri degsitirmez
        Person kisi2 = new Person("Ali", 15);

        System.out.println("kisi1 = " +kisi1.fingerPrintCode);
        System.out.println("kisi2 = " +kisi2.fingerPrintCode);

    }
}
