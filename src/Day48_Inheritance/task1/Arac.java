package Day48_Inheritance.task1;

public class Arac {
    // Arac isimli bir superclass olusturun. fields: renk, motor, model.
    // Constructor ekleyin ve getter ve setter  metodlari ve toString ekleyin.
    // Bu siniftan Otobus sinifini olusturun ve yolcu sayisini ekleyin...
    // 4- Bir aracPark isimli icinde main olan bir sinif olusturun
    //  Otobusen nesne olsuturarak otobisin ozellilerini ekran ayazdiriniz.



    private String renk;
    private int motor;
    protected String model;

    public Arac(String renk, int motor, String model) {
        setRenk(renk);
        setMotor(motor);
        setModel(model);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", model='" + model + '\'' +
                '}';
    }
}
