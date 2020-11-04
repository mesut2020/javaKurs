package Day54.Tasks.task1;

public interface IElectric extends IVehicle{
    final static int batteryLife = 100;

    String changeBattery();

    default void print(){
        System.out.println("Default tipli method yazilabilir");
    }

    static void autoPilot(){
        System.out.println("Otonom surus modu...");
    }

}
