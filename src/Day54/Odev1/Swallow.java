package Day54.Odev1;

public class Swallow implements IFlying {
    @Override
    public String food() {
        return "Karada beslenir";
    }

    @Override
    public void flying() {
        System.out.println("Ucabilen bir kustur.");

    }

}
