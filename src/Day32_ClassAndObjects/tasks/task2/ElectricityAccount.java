package Day32_ClassAndObjects.tasks.task2;

public class ElectricityAccount {
    //fields:
    int totalKw=0;
    double rate=0.7;
    double bill=0;

    void tuketimEkle(int tuketim){
        totalKw+=tuketim;
    }

    double totalBill(){

        return rate*totalKw;
    }
}
