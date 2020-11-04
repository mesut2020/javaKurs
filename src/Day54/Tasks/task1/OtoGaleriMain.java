package Day54.Tasks.task1;

import java.util.ArrayList;

public class OtoGaleriMain {
    public static void main(String[] args) {
        TeslaCar teslaCar =new TeslaCar("Tesla p90", 2500);
        ToyotaPrius prius = new ToyotaPrius("Prius20", 1600);
        CityBus bus = new CityBus("Mercedes 302", 6000);

        // Super class olarak veya Ana Interface olarak da tanimmlanabilir. IVehicle veya Vehicle yada <> bu kullanilmaz.
        ArrayList<IVehicle> list = new ArrayList<>();
        list.add(teslaCar);
        list.add(prius);
        list.add(bus);

        for (IVehicle obj:list) {
            System.out.println(obj.getClass().getSimpleName());
        }

        teslaCar.print();
        IElectric.autoPilot();
    }
}
