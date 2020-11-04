package Day53_Interfaces.Ornekler.Ornek4;

public class Test implements IYazdir,IGoster {
    @Override
    public void yaz() {
        System.out.println("Goster yaz");
    }
    // implemente edilen interfaceler de aynı isim ve paramatrede
    // olan metdolardan bir tane yazmak yeterlidir,
    // problem oluşturmaz.

    @Override
    public void goster() {
        System.out.println("Goster...");
    }
}
