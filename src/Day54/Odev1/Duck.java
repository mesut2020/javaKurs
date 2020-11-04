package Day54.Odev1;

public class Duck implements ISailing,IFlying{
    @Override
    public String food() {
        return "Hem denizde hem de karada beslenir...";
    }

    @Override
    public void flying() {
        System.out.println("ucar");
    }

    @Override
    public void sailing() {
        System.out.println("yuzer");
    }
}
