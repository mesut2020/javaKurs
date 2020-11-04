package Day58_JavaBitiyor.Ornek1;

import java.util.ArrayList;
import java.util.Scanner;

    public class TechnoCafe {
    static void menu(){
        System.out.println("***MENU***");
        System.out.println("1.Adana kebap\n2.Lahmacun\n3.Borsh\n4.Palov\n0.Tamam");
        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String decide = "";
        ArrayList<IFood> siparis = new ArrayList<>();
        menu();

        while(!decide.equals("0")) {
             decide = sc.nextLine();
            switch (decide) {
                case "1":AdanaKebap adanaKebap = new AdanaKebap();
                    siparis.add(adanaKebap);
                    break;
                case "2":Lahmacun lahmacun = new Lahmacun();
                    siparis.add(lahmacun);
                    break;
                case "3": Borsh borsh = new Borsh();
                    siparis.add(borsh);
                    break;
                case "4":Palov palov = new Palov();
                    siparis.add(palov);
                    break;
                case "0": break;
                default:
                    System.out.println("Su var bedava");
            }
        }

        for (IFood yemek: siparis ) {
            TechnoKitchen.pisir(yemek);
            System.out.println();
        }
        System.out.println("---------------------");
        double toplamUcret=0;
        for (IFood yemek: siparis ) {
            System.out.println(yemek.getClass().getSimpleName()+ ":"+ yemek.ucret() );
            toplamUcret+= yemek.ucret();
        }
        System.out.println("Toplam ucret:" +toplamUcret);
        System.out.println("---------------------");

    }
}
