package Day55_AbstractClass.Ornekler.Ornek1;

public class Ford extends BinekOto {

    @Override
    public String getMarka() {       // Abstract  metod oldugundan kullanilmak zorunda (buraya implemente edildi...)
        return "Ford Focus";
    }

    // abstract class da yazilmis, abstract olmayan metodlari
    // ister oldugu gibi kullaniriz
    // istersek bir seyler ekleyebilriz.
    public int getUretimYili(){
        System.out.println(super.getUretimYili());
        return super.getUretimYili();
    }

}
