package Day14_Loop;

public class hw_4 {
    public static void main (String[] args) {
        //1-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız...

        int counter = 1;

        while (counter <= 255) {

            System.out.println(counter +" "+ (char)counter); //Bosluk olmazsa ikisini topluyor...
            counter++;
        }

    }
}
