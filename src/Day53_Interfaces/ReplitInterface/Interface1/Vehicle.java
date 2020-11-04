package Day53_Interfaces.ReplitInterface.Interface1;
//  1      Vehicle class interface'i (arayüz) yap.//
//        3 adet method oluşturun.
//        Birinci method ismi changeGear   parametresi 1 adet int.
//        İkinci method ismi speedUp parametresi 1 adet int.
//        Üçüncü method ismi applyBrakes parametresi 1 adet int.

interface Vehicle {
    void changeGear(int a);
    void speedUp(int b);
    void applyBrakes(int c);
}
