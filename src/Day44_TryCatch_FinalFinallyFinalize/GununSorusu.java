package Day44_TryCatch_FinalFinallyFinalize;

import java.util.Scanner;

public class GununSorusu {
//1- Girilen bir stringi int e çeviren bir program yazınız.
//Girişler scannerla nextLine ile alınacak
//Çevirme işlemini bir metod ile yapınız ve oluşabilecek hataları bir metod içinde kontrol ediniz.
public static int convertStringToInteger(String strNum){
    int num=0;
    try {
        num = Integer.parseInt(strNum);
        System.out.println("num : "+num);
    }
    catch (NumberFormatException e){
        System.out.println(e.getCause()+ "\nLutfen sadece rakam giriniz...");
    }

    return num;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String strNum = sc.nextLine();

    convertStringToInteger(strNum);



 }
}

