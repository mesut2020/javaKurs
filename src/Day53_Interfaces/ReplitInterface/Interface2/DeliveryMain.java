package Day53_Interfaces.ReplitInterface.Interface2;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // replit dp olarak yanlis yazilmis, scan olmali


        ArrayList<String> listNumbers = new ArrayList<>();

        int counter = 0;
        while(scan.hasNext()){

            listNumbers.add(scan.nextLine()); // a olarak yanlsi girilmis
            counter++;
            if(counter==10) {

                break;
            }
        }

        // while calling the methods in the classes use listNumbers arraylist


//        main method'un içinde
//        iki tane objects oluşturun.
//              Biri Amazon class'ı için
//              Diğeri costco classı için.
//
//        amazon class'ının içinde isFreeShipping'i çağırın ve sonucu yazdırın.
//                costco class'ının içinde isFreeShipping'i çağırın ve sonucu yazdırın.

        Amazon amazon = new Amazon();
        Costco costco = new Costco();

        System.out.println(amazon.isFreeShipping(listNumbers));

        System.out.println(costco.isFreeShipping(listNumbers));

        System.out.println(amazon.getTheTotal(listNumbers));
        System.out.println(costco.getTheTotal(listNumbers));

    }


}
