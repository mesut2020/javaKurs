package Day59.Ornek1;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingSystem {

    static void menuBankalar(){
        System.out.println("=== BANKALAR ===");
        System.out.println("1. Bank of America");
        System.out.println("2. ChaseBank");
        System.out.println("3. WellsFargo");
    }
    static void menuIslemler(){
        System.out.println("=== ISLEMLER ===");
        System.out.println("1. Para yatir");
        System.out.println("2. Para cek");
        System.out.println("3. Kredi talep");
        System.out.println("4. Bakiye");
        System.out.println("5. Hesap Kapatma talebi gonder");
        System.out.println("0. Cikis");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Bank> hesapList = new ArrayList<>();

        String secim1 ="";

        while(!secim1.equals("0")){
            menuBankalar();
            System.out.println("Hangi bankada hesap acmak istiyorsunuz?");
            System.out.print("Seciminiz= ");

            secim1 = sc.nextLine();
            if (secim1.equals("0")) break;

            System.out.print("Adınız: ");
            String ad = sc.nextLine();

            System.out.print("Telefon No: ");
            String telNo = sc.nextLine();

            System.out.print("Adres: ");
            String adres = sc.nextLine();

            Bank hesap = null;

            switch (secim1) {
                case "1":
                    hesap = new BOA(ad, telNo, adres);
                    break;
                case "2":
                    hesap = new ChaseBank(ad, telNo, adres);
                    break;
                case "3":
                    hesap = new WellsFargo(ad, telNo, adres);
                    break;
                default:
                    System.out.println("Gecerli banka numarasi girmediniz...");
            }

            menuIslemler();

            Scanner sc2 = new Scanner(System.in); // double icin

            String secim2 ="";

            while (!secim2.equals("0")) {
                double miktar = 0;
                System.out.print("Secim= ");
                secim2 = sc.nextLine();
                switch (secim2) {
                    case "1":
                        System.out.print("Yatirilicak miktar: ");
                        miktar = sc2.nextDouble();
                        System.out.println(hesap.deposit(miktar));
                        break;
                    case "2":
                        System.out.print("Cekilecek miktar: ");
                        miktar = sc2.nextDouble();
                        System.out.println(hesap.withdraw(miktar));
                        break;
                    case "3":
                        System.out.print("Kredi talebiniz olsuturuldu...");
                        System.out.println(hesap.loan()); // retrun metod
                        break;
                    case "4":
                        System.out.println("Bakiyeniz: " + hesap.getBalance());
                        break;
                    case "5":
                        if (hesap.closeAccount()) {
                            hesap = null; secim2="0"; // hesabi silince menuden cikmasi icin...
                        }
                        break;
                }
            }
            if (hesap!=null) hesapList.add(hesap); // hesap silindi ise ekleme
        }

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-20s%-10s\n","Banka Adi:","Musteri No:","Hesap No:","Hesap sahibi:","Tel no:","Adresi:","Bakiyesi:" );
        for (Bank b: hesapList) {
            b.yaz();
        }
    }
}
