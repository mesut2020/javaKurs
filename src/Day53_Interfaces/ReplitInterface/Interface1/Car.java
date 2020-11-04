package Day53_Interfaces.ReplitInterface.Interface1;
//   3     Car class Vehicle'a implementing ediliyor.
//
//        2 adet int oluşturun. speed ve gear
//
//        2 methodu Override edin.
//        3 methodun hepsini Vehicle interface'ine Override edin.
//        variable gear'ı parameter gear'a eşitleyin.
//
//        speedUp methodunun içinde,
//        speed variable'ını arttırın.
//
//        applyBreakes methodunun içinde,
//        speed variable'ını azaltın.//
//
//        printAll  isminde bir method oluşturunuz.
//        print şu şekilde olmalıdır. > current speed is SPEED gear count is GEAR
//
//        not: SPEED  speed veriable'ıdır. GEAR  gear veriable'ıdır.

class Car implements Vehicle {
    int speed;
    int gear;

    public void changeGear(int gear){
        this.gear=gear;
    }

    public void speedUp(int speed){
        this.speed+=speed;    }

    public void applyBrakes(int speed){
        this.speed-=speed;
    }

    public void printAll(){
        System.out.println("current speed is "+speed+" gear count is "+gear);
    }

}