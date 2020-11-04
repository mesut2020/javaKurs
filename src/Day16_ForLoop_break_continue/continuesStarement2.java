package Day16_ForLoop_break_continue;

import java.util.Scanner;

public class continuesStarement2 {
    public static void main(String[] args) {
        // Kullanicidan 5 adet sayi iste...
        //Bu sayilardan 5 ile 10 arasindakiler haric (5 ve 10 toplanacak)
        //digerlerinin toplmaini bulunuz
        // continue kullanarak cozun
        int total=0;
        for (int i=1; i<=5; i++)
        {
            Scanner sc=  new Scanner(System.in);
            System.out.print(i + ". sayiyi giriniz:");
            int num = sc.nextInt();

            if (num>5 && num<10 )
            {
                System.out.println("5 ile 10 arasinda bir sayi giriniz. Toplanmayacak...");
                continue;
            }

            total+=num;

        }
        System.out.println(total);


    }


}
