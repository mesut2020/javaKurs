package Day49_Inheritance.task2.pak1;

public class pak1Main {
    public static void main(String[] args) {
        pak1Hayvan hayvan1 = new pak1Hayvan();
        hayvan1.ad="karakedi"; // public butun classlardan erisim var...
        hayvan1.yas =2;  // default:
        hayvan1.cins = "tekir"; // protected kendi paketinin icinden erisilir.
        // hayvan1.renk; renk private oldugu icin baska class dan erisilemez.

    }
}
