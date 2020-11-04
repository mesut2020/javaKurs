package Day52_Polymorphism.Polymorphism.Ornek1;

public class Hayvan {
private String name;

    public Hayvan(String name) {
        this.name = name;
    }

    public void ses(){
        System.out.println("Ses cikardi...");
    }
    public static void KopekSesi(Kopek kopek)
    {
        kopek.ses();
    }

    public static void KediSesi(Kedi kedi)
    {
        kedi.ses();
    }

    // Polymorphism imkanı ile 2 farklı subclas dan üretilmiş nesne
    // super class gibi biçimimnde (Çok biçimlilik) aynı metoda tek bir tipmiş
    // gibi gönderilebildi buna Polymorphism (Çok biçimlilik) denir.
    // üstteki metdolarla aynı yerde olması için, burada yazıldı, en doğruu
    // Hayvan class ında olması bu metodun.
    public static void HayvanSesi(Hayvan hayvan)
    {
        hayvan.ses();
    }
}
