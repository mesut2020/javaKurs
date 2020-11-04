package Day49_Inheritance.task2.pak2;

import Day49_Inheritance.task2.pak1.pak1Hayvan;

public class pak2Kedi extends pak1Hayvan {

    public pak2Kedi(String ad, String cins) {
        super.ad= ad;
        super.cins =cins;

    }

    public void bilgiYaz(){
        System.out.println("super.ad = " + super.ad);
        System.out.println("super.cins = " + super.cins);
    }


}
