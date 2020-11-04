package Day36_Constructors.tasks.task2;
    // Buraya sag tiklayinca toString veya Constructor olsuturabiliyorsun

public class Bank {
    int id;
    String name;
    String address;

    public Bank(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public Bank(int id,String name){
        this(id,name,"");
    }
    public Bank(){
        this(0,"","");
    }

    @Override
    public String toString(){

        return id +" " + name + " " +address;

        // sıfır çıkmaması için
        //String yazilacak=this.ad+" "+this.subeSayisi;
        // if (kurulus>0)
        //     yazilacak+=" "+kurulus;
        // return yazilacak;

    }
}
