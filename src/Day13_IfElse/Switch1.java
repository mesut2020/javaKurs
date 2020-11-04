package Day13_IfElse;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        //Kullanicinin girdigi gun sayisina karsilik gelen gun adini yaziniz
        // 1.gun Pazartesi olsun

        Scanner sc = new Scanner(System.in) ;
        System.out.println("dayNo =");
        int dayNo=sc.nextInt();

        switch(dayNo)
        {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Bitte zwischen 1-7");

        }
    }
}
