package Day46_Encapsulation.Examples.ex1;

public class Kisi {
    String ad;
    String soyad;
    private int yas;

    // setter method
    public void setYas(int yas){

        if(yas > 0)
        this.yas = yas;
        else this.yas=-yas;

        //this.yas = Math.abs(yas); yukaridaki yerine mutlak deger de kullnilabilir.

    }

    // getter method
    public int getYas(){
        return this.yas;
    }

}
