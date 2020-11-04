package Day54.Odev1;

public class Shark implements ISailing {
    @Override
    public String food() {
        return "Buyuk balik kucuk baligi yutar...";
    }

    @Override
    public void sailing() {
        System.out.println("yuzer");

    }
}
