package Day22_Java_Methods;

public class replit_Method3 {
    public static String reverseString(String text){

        String[] ch = text.split("");
        int c=0;
        String revText="";

        for (int i=ch.length-1; i>=0;i--)
            revText+= ch[i];

        return revText;
    }

    public static void main(String[] args){

       /* reverseString isminde bir method oluşturun.
                Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten yazsın.
        Terste yazılmış halini yazdırınız.

        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ */

        String text = "Java'yı Seviyorum.";
        String newText;

        newText=reverseString(text);

        System.out.println(newText);

    }
}
