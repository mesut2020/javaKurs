package Day37_Public_default_friendly_private.instanceModifiers.protectedModifiers.same;

public class Doctor {
    String name;

    protected Doctor(){

    }

    public Doctor(String name) {
        this.name = name;
    }

    protected void print(){
        System.out.println("ad = " +name);
    }
}
