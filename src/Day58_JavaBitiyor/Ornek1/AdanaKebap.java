package Day58_JavaBitiyor.Ornek1;

public class AdanaKebap implements IFood {

    @Override
    public void taste() {
        System.out.println("En sevdigim kebap, Adana kebap...");
    }

    @Override
    public double ucret() {
        return 8;
    }

    public void marinade(){
        System.out.println("Et bicak ile ligme ligme edilir ve cesitli baharatlarla karisitirilip sogumaya birakilir...");
    }

    public void grill(){
        System.out.println("Soguk sise takilip, mangal da pisirilir...");

    }
}
