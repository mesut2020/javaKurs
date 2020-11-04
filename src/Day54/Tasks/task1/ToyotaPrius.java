package Day54.Tasks.task1;

public class ToyotaPrius extends Vehicle implements IElectric,IGas {

    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "5 yilda bir degsitir";
    }

    @Override
    public String changeOil() {
        return "10 bin km de bir yagini degsitir";
    }

    @Override
    public String drive() {
        return "Arabayi kendin sur";
    }
}
