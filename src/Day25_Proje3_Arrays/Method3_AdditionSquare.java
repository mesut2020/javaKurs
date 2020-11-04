package Day25_Proje3_Arrays;

public class Method3_AdditionSquare {
    public static int getSumOfSquares(int num1){
        int total = 0;
        for (int i = 1; i <= num1 ; i++) {
                total+=i;
        }

        return total* total;
    }

    public static int substSquare(int num1,int num2){
        int kare1=getSumOfSquares(num1);
        int kare2=getSumOfSquares(num2);
        return kare1+kare2;
    }

    public static void main(String[] args) {

        /*SubtractionSquare:
        getSumOfSquares adında bir sayı alan ve bu sayıya kadar olan sayıları
        toplayıp çıkan sonucun karesini döndüren bir metod yazınız.
        substSquare isminde 2 adet int parametre alan ve int sonuç döndüren bir metod daha yazınız.
                main den   substSquare   metoduna 2 tane sayı gönderiniz, bu metodun içinden de
        getSumOfSquares metodunu çağırarak gönderilen bu iki sayı için işlem sonuçlarını toplayarak
        main metodundan yazdırınız.
                Örnek:
        int 1 = 10;               yazacağınız method 10 u kullanarak 3025 sonucu verir
        int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir
        3025 + 225 = 3250
        return 3250*/

        int num1 = 5;
        int num2 = 10;

        System.out.println(substSquare(num1, num2));

    }
}
