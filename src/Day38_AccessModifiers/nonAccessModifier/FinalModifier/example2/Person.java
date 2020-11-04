package Day38_AccessModifiers.nonAccessModifier.FinalModifier.example2;

public class Person {
    String name;
    final int fingerPrintCode;

    public Person(String name, int fingerPrintCode) {
        this.name = name;
        this.fingerPrintCode = fingerPrintCode;
    }

    // final degsikenlerine ilk deger atama islemi direk yapilabildigi gibi constrauctorla da atanabilir...
    // ancak daha sonra yine degeri degistirilemez.
    // bu islem ilk deger atama icin gecerli.
}