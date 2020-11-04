package Day55_AbstractClass.Ornekler.Ornek2;

import java.text.DecimalFormat;

public abstract class Sekil {

    private String name;

    public Sekil(){
    }

    public Sekil(String name){
        setName(name);
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public abstract double alan();
    public abstract double cevre();

    @Override
    public String toString() {
        return  "name=" + getClass().getSimpleName() +
                "\nalan=" +new DecimalFormat("##.##").format(this.alan())+
                "\ncevre=" +new DecimalFormat("##.##").format(this.cevre()) ;
    }

    public void ciz(){
        System.out.println(getClass().getSimpleName() + " cizildi...");
    }
}
