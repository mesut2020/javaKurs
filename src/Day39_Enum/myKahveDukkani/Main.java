package Day39_Enum.myKahveDukkani;

public class Main {
/*
todo  enum 1.
"bakiye" isminde ayrı bir class oluşturun.
Elemanın ismi Musteri1 olsun ve parametresi 10 olsun. ---> Musteri1(bakiyem:10); (bakiyem double cinsinden olmalı.) bakiyem 10 euro
todo  enum  2.
Ayrı bi enum class açın ve ismi Tatlilar olsun ve parametresi tatliFiyati olsun.
Elemanları  CİLEKLİPASTA ve fiyatı 4 ,              MOZAİKPASTA ve fiyatı 3.5,               MUZLUPASTA ve fiyatı 4.5 olsun.

todo enum 3.

Ayrı bir classta icecekler isminde enum class açın ve parametresi fiyat olsun.

TURKKAHVESİ     3
ESPRESSO            4.5                                             euro olsun.
GAZOZ                2.25
LİMONATA        2



todo İPUCU !!! Fiyat bilgilerimize main class ımızdan direkt erişilmesini ve değiştirilmesini istemiyoruz. Fiyatlara erişebilmek için methodları kullanın.


todo Main methodun içi:

müsteriyi cagırın.

içecek olarak gazoz alsın.

tatlı olarak cilekli pasta alsın.


todo kosul:

Eğer toplam tutar bakiyemden büyük ise,

bakiyeniz yetersiz... Toplam tutar = 10.50
  Bakiyeniz : 10                                        yazsın. (toplam tutar örnek amaçlı yazıldı)

diğer durumlarda ise
müşteri adım,
siparişlerim,
 toplam tutar
  para üstü
   Yeni bakiyem

                                                                    alt alta  yazsın.


todo KONSOL ÖRNEĞİ ( Eğer toplam tutar bakiyeden büyük ise)

        Musteri1  Bakiyeniz yetersiz.. ---  Toplam tutar:   10.25
         Bakiyeniz : 10

 todo    Diğer durumlarda:
Müşteri no:  Musteri1
Siparişleri :  GAZOZ -CİLEKLİPASTA
 ToplamTutar= 6.25
Paraüstü = 3.75
Yeni bakiyem = 3.75




todo NOT:
2 durumu da görebilmek için sonradan ekstra bir tatlı daha ekleyin ve onun fiyatını toplam tutara ekleyin.

 */
public static void main(String[] args) {
    bakiye musteriler = bakiye.Musteri1;
    Icecekler icecekler1 = Icecekler.GAZOZ;
    Tatlilar tatlilar1 = Tatlilar.CİLEKLİPASTA;
    Tatlilar tatlilar2 = Tatlilar.MUZLUPASTA;

    double icecek = icecekler1.getFiyat();
    double tatli  = tatlilar1.getFiyat();
    double tatli2 = tatlilar2.getFiyat();

    double bakiyem = musteriler.getBakiyem();

    double toplamTutar = icecek+tatli+tatli2;


    if (toplamTutar > bakiyem) System.out.println(musteriler + "bakiyeniz yetersiz... Toplam tutar = " + toplamTutar + "\nBakiyeniz : "+ bakiyem);
    else System.out.println("Musteri no : " + musteriler + "\n Siparişleri : " + icecekler1 + " - "+tatlilar1+" - "+tatlilar2+
            "\nToplamTutar = " + toplamTutar + "\nParaüstü = " + (bakiyem-toplamTutar) + "\nYeni bakiyem = " +(bakiyem-toplamTutar));

}


}
