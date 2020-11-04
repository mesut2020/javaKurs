package Day34_Class.example.ex1;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {


    @Test
    public void testGetArea()
    {
        // nesneyi oluştur, ve verileri hazırla
        Rectangle dikdortgen=new Rectangle();
        dikdortgen.length =5;
        dikdortgen.width =4;

        // beklenen yani actual değeri al
        int sonuc = dikdortgen.getArea(); // actual değer yani o anda gelen değer

        // Assert ile karşılaştır
        Assert.assertEquals("Testi geçemedi ",20, sonuc);
    }

    @Test
    public void testGetArea2()
    {
        // nesneyi oluştur, ve verileri hazırla
        Rectangle dikdortgen=new Rectangle();
        dikdortgen.length =5;
        dikdortgen.width =4;

        // beklenen yani actual değeri al
        int sonuc = dikdortgen.getArea(); // actual değer yani o anda gelen değer

        // Assert ile karşılaştır
        Assert.assertEquals("Testi geçemedi ",22, sonuc);
    }
}