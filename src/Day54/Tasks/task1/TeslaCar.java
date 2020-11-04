package Day54.Tasks.task1;

public class TeslaCar extends Vehicle implements IElectric {

    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "10 yilda bir batarya degisir...";
    }

    @Override
    public String drive() {
        return "Hizli sure, Auto pilot sur";
    }
}
