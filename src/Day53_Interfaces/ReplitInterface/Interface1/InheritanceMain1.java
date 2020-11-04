package Day53_Interfaces.ReplitInterface.Interface1;

import java.util.Scanner;

class InheritanceMain1 {
//  4  main method'un içinde;
//    Bicycle class ve Car class için object oluşturun.
//
//    changeGear , speedUp  ,  applyBrakes method'larını
//    Bicycle ve Car class'larında çağırın.
//
//    Önce Bicycle class'ındaki printAll'u çağırın
//    Sonra Car class'ındaki printAll'u çağırın.

    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        int speedIncrease = dp.nextInt();
        int speedDecrease = dp.nextInt();
        int gearForBicycle = dp.nextInt();
        int gearForCar = dp.nextInt();

        // while calling the methods in the classes use these variables

        Bicycle bic = new Bicycle();
        bic.changeGear(gearForBicycle);
        bic.speedUp(speedIncrease);
        bic.applyBrakes(speedDecrease);

        Car car = new Car();
        car.changeGear(gearForCar);
        car.speedUp(speedIncrease);
        car.applyBrakes(speedDecrease);

        bic.printAll();
        car.printAll();

    }
}
