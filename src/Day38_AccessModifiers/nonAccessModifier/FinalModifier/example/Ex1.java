package Day38_AccessModifiers.nonAccessModifier.FinalModifier.example;

public class Ex1 {

    public static void main(String[] args) {
        // bir dairenin alani pi*r*r
    int yaricap=4;

    double alan = 4*4*Constants.pi;

    // verilen saat dakika gun bilgisi
        //saniye ceviriniz
        int gun = 23;
        int saat = 7;
        int dakika=25;

        int saniyeCinsinden =
                gun * Constants.hourInDay *Constants.minuteInHour* Constants.secondInMinute+
                        saat* Constants.minuteInHour* Constants.secondInMinute+
                        dakika * Constants.secondInMinute;
        System.out.println("saniyeCinsinden = " + saniyeCinsinden);
    }
}
