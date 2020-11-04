package Day48_Inheritance.task1;

public class Otobus extends Arac {
    int yolcuSayisi;
    public Otobus(String renk, int motor, String model, int yolcuSayisi) {
        super(renk, motor, model);
        this.yolcuSayisi=yolcuSayisi;

    }

    @Override
    public String toString() {
        return "Otobus{" +
                "renk='" + getRenk() + '\'' + // private oldugu icin direk esilemez
                ", motor=" + getMotor() +     // bu yuzden gertter ile aldik
                ", model='" + model + '\'' +  // protected oldugu icin direk ulastik
                "yolcuSayisi=" + yolcuSayisi +
                '}';
    }
}
