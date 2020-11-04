package Day45_Proje7_MentoringDateAndTime;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class Ornek_2 {

    // LocalTime kullanarak ve test ortaminda
    //1. mevcut saate arti dakika ve saat ekleyiniz
    //2. mevcut saatten eksi dakika ve saat cikariniz

    @Test
    public  void testPlus(){

        LocalTime zaman = LocalTime.of(5, 45);

        LocalTime actual = zaman.plusHours(1).plusMinutes(10);

        Assert.assertEquals(6, actual.getHour());
        Assert.assertEquals(55, actual.getMinute());

    }

    @Test
    public void testMinus(){

        LocalTime zaman = LocalTime.of(10,40);

        LocalTime actual = zaman.minusHours(2).minusMinutes(5);

        Assert.assertEquals(8,actual.getHour());
        Assert.assertEquals(35, actual.getMinute());
    }
}
