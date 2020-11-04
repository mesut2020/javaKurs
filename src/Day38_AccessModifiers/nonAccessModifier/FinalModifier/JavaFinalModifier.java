package Day38_AccessModifiers.nonAccessModifier.FinalModifier;

public class JavaFinalModifier {

    // final : oyle bir degiskeniniz varki, bir deger ataniyor
    // ve onun yazilim icinde degistirilmesi istemiyor
    // mesela pi sayisi gibi
    // sadece ilk deger atanabilir...

    final double pi=3.14;

    public static void main(String[] args){

        final int number= 5;

        //number =7;  // tekar yeni bir deger atanamaz...

        System.out.println(number);

    }

}
