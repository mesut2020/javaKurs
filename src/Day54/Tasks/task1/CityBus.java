package Day54.Tasks.task1;

public class CityBus extends Vehicle implements IDiesel {

    public CityBus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Diesel yakit bitmeden degsitir";
    }

    @Override
    public String drive() {
        return "Uykulu araba kullanma, can tasiyorsun...";
    }
}
