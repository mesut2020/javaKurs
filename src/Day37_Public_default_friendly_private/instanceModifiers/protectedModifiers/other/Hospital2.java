package Day37_Public_default_friendly_private.instanceModifiers.protectedModifiers.other;

import Day37_Public_default_friendly_private.instanceModifiers.protectedModifiers.same.Doctor;

public class Hospital2 {
    public static void main(String[] args) {

        // protected, default gibi
        // diger paketlerden ulasilamiyor...
        Doctor dr3 = new Doctor("Ali"); // public olan Doctor a ulasabilir

        // dr3.print(); // protected oldugu icin access yok

    }
}
