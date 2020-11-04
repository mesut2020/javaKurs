package Day53_Interfaces.Ornekler.Ornek3;

import Day53_Interfaces.Ornekler.Ornek2.ICizilebilir;

public class A4 implements Iyazdirilabilir,Igosterilebilir {

    @Override
    public void goster() {
        System.out.println("Gosterildi...");
    }

    @Override
    public void yaz() {
        System.out.println("Yazdirildi...");
    }
}
