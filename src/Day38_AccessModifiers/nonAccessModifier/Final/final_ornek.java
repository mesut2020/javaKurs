package Burak.Non_AccessModifiers.Final;

public class final_ornek {
    //todo İsminde de anlaşılacağı gibi, sadece bir defa değer verebiliyoruz. Bu değeri kesinlikle değiştiremiyoruz.

    //todo Bu final alanlarına 2 türlü değer verebiliyoruz.

    //todo 1) Tanımlandığı yerde.

    //todo 2) Constructor'da.

    //public final int number;       //java bize buna değer vermen gerekiyor diyor.
    public final int number = 10;
    //public final int number; bu şekide yazıp değerini aşağıdaki constructor'da verebiliriz.

    public void finalTest(){
        //number = 12; //Öncesinde değer verdiğim için şimdi değiştirmeme izin vermiyor.
    }
}
