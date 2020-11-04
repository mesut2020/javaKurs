package Day42_DateAndTime.Manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class _7_LocalTimeTask {
    //using current LocalTime
    //1. test current time with plus minute and plus hour :
    //      Şu andaki zamana 1 saat ve 1 dakika ekleyerek sonucun saatini ve dakikasını ayrı ayrı test ediniz.
    //2. test current time with minus minute and plus hour:
    //      Şu andaki zamana 1 saat ve 1 dakika çıkartarak sonucun saatini ve dakikasını ayrı ayrı test ediniz.

// ************* Anlik zamani aldigi icin testiniz 1 dakika gecince degismis oluyor.
    @Test
    public void test1(){
        LocalTime tm = LocalTime.now();
        LocalTime actual1 = tm.plusHours(1).plusMinutes(1);

        Assert.assertEquals(23, actual1.getHour());
        Assert.assertEquals(05, actual1.getMinute());
    }

    @Test
    public void test2(){
        LocalTime tm = LocalTime.now();
        LocalTime actual2 = tm.minusHours(1).minusMinutes(1);

        Assert.assertEquals(21, actual2.getHour());
        Assert.assertEquals(03, actual2.getMinute());
    }

}
