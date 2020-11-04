package Day37_Public_default_friendly_private.instanceModifiers.protectedModifiers.same;

public class Hospital {
    public static void main(String[] args) {
        Doctor dr = new Doctor();
        dr.name = "Ahmet";
        dr.print();

        Doctor dr2= new Doctor("Ayse");

    }

}
