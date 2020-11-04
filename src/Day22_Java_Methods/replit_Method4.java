package Day22_Java_Methods;

public class replit_Method4 {
    public static String reverseWord(String text){

        String[] word = text.split(" ");

        String revText="";

        for (int i=word.length-1; i>=0;i--){
            revText+= word[i]; if(i!=0) revText+=" ";}

        return revText;
    }

    public static void main(String[] args){

/*        adı  reverseWord olan bir method oluşturun
        Bu methodun String olarak bir parametresi olmalıdır
        Ve bu cümledeki kelimelerle tersine çevirmeli
        Ters halini yazdırın.
                Örnek 1 :
                Dize: Java yazın
        dönüş şöyle olmalıdır:  yazın Java

        Örnek 2:
        Dize: Sakin olun ve evde kalın
        dönüş olmalı: kalın evde ve olun sakin*/

        String text = "Sakin olun ve evde kalın";

        String revText=reverseWord(text);

        System.out.println(revText);

    }
}
