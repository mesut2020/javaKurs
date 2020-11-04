package Day29_Collections_SetAndMap;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task1_b {

     /*
            // Kullanıcıya
            // 1-Ekleme
            // 2-Listeleme
            // 3-Arama
            // 4-Düzeltme
            // 5-Çıkış
            // Seçeneklerini vererek username,password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
            // Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
            // Mainde sadece Seçenekler ve metodların çağrılması olsun.
            // Bölüm bölüm gidiyoruz önce mainin içini tasarlayınız.
         */

    public static void main(String[] args) {

        Map<String, Map<String, String>> users = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            anaMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:     // Kullanici Bilgisi Ekleme
                    users.putAll(userDetailsInput());
                    System.out.println();
                    break;
                case 2:     // Kullanici Bilgileri Yazdirma
                    userList(users);
                    System.out.println();
                    break;
                case 3:     // Kullanici Arama
                    System.out.print("Aranan Kelimeyi Giriniz : ");
                    sc.nextLine();
                    String strSearch = sc.nextLine();
                    userSearch(users, strSearch);
                    System.out.println();
                    break;
                case 4:     //Kayit Düzeltme
                    System.out.print("Düzeltilecek Kaydı Giriniz : ");
                    sc.nextLine();
                    String strUpdate = sc.nextLine();
                    userInfoUpdate(users, strUpdate);
                    System.out.println();
                    break;
                case 5:     //Kayit Silme;
                    System.out.print("Silinecek Kullanıcı'yı Giriniz : ");
                    sc.nextLine();
                    String strDelete = sc.nextLine();
                    userDelete(users, strDelete);
                    System.out.println();
                    break;
                case 6:     //Kayit Tipleri Listeleme
                    kayitTipleriListesi(users);
                    System.out.println();
                    break;
            }

        }while(choice != 7);

    }

    // Ana menü
    public static void anaMenu(){
        System.out.printf("%-30s", "_____ Kayıt İşlem Menüsü _____");
        System.out.printf("%6s%-25s\n", "", "__Bilgi ve Çıkış__");
        System.out.printf("%-18s", "1 - Ekleme");
        System.out.printf("%-18s", "4 - Düzeltme");
        System.out.printf("%-25s\n", "6 - Kayıt Tipleri");

        System.out.printf("%-18s", "2 - Listeleme");
        System.out.printf("%-18s", "5 - Silme");
        System.out.printf("%-25s\n", "7 - Çıkış");

        System.out.printf("%-25s\n", "3 - Arama");

        System.out.print("Seçiminiz : ");
    }
    // Girilen Kullanıcı Kayıt Tipleri
    public static void kayitTipleriListesi(Map<String, Map<String, String>> users){
        if (!users.isEmpty()) {
            Set<String> uTypes = new HashSet<>();
            for (Map.Entry<String, Map<String, String>> user : users.entrySet()) {
                uTypes.add(user.getValue().get("userType"));
            }
            System.out.println("Kayıtlı Kullanıcı Tipleri:");
            int i=1;
            for (String s : uTypes)
                System.out.println(i++ + ". " + s);
        }else
            System.out.println("Henüz Kayıt Yoktur.");
    }


    // Kullanıcı bilgilerini güncelleyen eden method
    public static void userInfoUpdate(Map<String, Map<String, String>> users, String strUpdate) {
        boolean found = false;
        if(users.containsKey(strUpdate)){
            System.out.print("Güncellenecek Kullanıcı : " + strUpdate);
            System.out.println("\t( Güncellemeyeceğiniz Kaydı Boş Geçiniz )");
            String pass = users.get(strUpdate).get("password");
            String type = users.get(strUpdate).get("userType");

            Scanner scM = new Scanner(System.in);
            System.out.printf("%-30s", "Eski Şifre");
            System.out.println(": " + pass);
            System.out.printf("%-30s", "Yeni Şifre Giriniz");
            System.out.print(": ");
            String newPass = scM.nextLine().trim();

            System.out.printf("%-30s", "Eski Kullanıcı Tipi");
            System.out.println(": " + type);
            System.out.printf("%-30s", "Yeni Kulanıcı Tipini Giriniz");
            System.out.print(": ");
            String newType = scM.nextLine().trim();
            System.out.println();
            if (newPass.length()>0 || newType.length()>0){
                if (newPass.length()>0) users.get(strUpdate).put("password", newPass);
                if (newType.length()>0) users.get(strUpdate).put("userType", newType);
                System.out.println(strUpdate + "  Kullanıcısının Verileri Güncellendi");
                userSearch(users, strUpdate);
            }else
                System.out.println(strUpdate + "  Kullanıcısının Güncelleme İşlemi İptal Edildi");
        }else
            System.out.println(strUpdate + "  Kullanıcısı Bulunamadı");
    }

    // Kullanıcı kaydını silen method
    public static void userDelete(Map<String, Map<String, String>> users, String strToDetele) {
        boolean found = false;
        if (users.keySet().remove(strToDetele))
            System.out.println(strToDetele + "  Kaydi Silindi..");
        else
            System.out.println(strToDetele + "  Bulunamadi.. Silme İşlemi Yapılmadı");
    }

    // Akullanıcıyı arayıp ekrana yazdıran method
    public static void userSearch(Map<String, Map<String, String>> users, String strToSearch) {
        System.out.println("Aranan Kelime : " + strToSearch);
        boolean found = false;
        userListTitle();
        int i=0;
        for (Map.Entry<String, Map<String, String>> user : users.entrySet()) {
            String userName = user.getKey();
            String userPass = user.getValue().get("password");
            String userType = user.getValue().get("userType");
            if (userName.contains(strToSearch) || userPass.contains(strToSearch) || userType.contains(strToSearch)){
                i++;
                userToScreen(i, userName, userPass, userType);
                found = true;
            }
        }
        if (!found) System.out.println("Kayıt bulunamadi");
    }

    // Kullanıcı Listesi için baslık methodu
    public static void userListTitle(){
        System.out.println("Kayıtlı Kullanıcı Bilgileri");
        System.out.printf("%-5s", "SNo");
        System.out.printf("%-20s", "Kullanici Adi");
        System.out.printf("%-20s", "Sifre");
        System.out.printf("%-20s\n", "Kullanici Tipi");
    }

    // Gelen bir kullınıcıyı ekrana yazan method
    public static void userToScreen(int i, String userName, String userPass, String userType){
        System.out.printf("%-5d", i);
        System.out.printf("%-20s", userName);
        System.out.printf("%-20s", userPass);
        System.out.printf("%-20s\n", userType);
    }

    // Kullanıcıları listeleyip tek tek yazdırmak için userToScreen'e gönderen method
    public static void userList(Map<String, Map<String, String>> users){
        int i=0;
        if (!users.isEmpty()) {
            userListTitle();
            for (Map.Entry<String, Map<String, String>> user : users.entrySet()) {
                i++;
                String userName = user.getKey();
                String userPass = user.getValue().get("password");
                String userType = user.getValue().get("userType");
                userToScreen(i, userName, userPass, userType);
            }
        }else
            System.out.println("Kullanıcı Kaydı Bulunmamaktadır.");
    }

    //  Kullanıcı bilgileri konsoldan alınıyor ve
    //  Kayıt için MapHazirla methoduna gönderiliyor
    public static Map<String, Map<String, String>> userDetailsInput() {
        String userName, password, userType, eMail;
        Scanner scM = new Scanner(System.in);
        System.out.println("Yeni Kayıt Edilecek Kullanıcı Bilgileri:");
        System.out.printf("%-30s", "Kulanıcı Adını Giriniz");
        System.out.print(": ");
        userName = scM.nextLine();

        System.out.printf("%-30s", "Kulanıcı Şifresini Giriniz");
        System.out.print(": ");
        password = scM.nextLine();

        System.out.printf("%-30s", "Kulanıcı Tipini Giriniz");
        System.out.print(": ");
        userType = scM.nextLine();

        return MapHazirla(userName, password, userType);
    }

    //Gelen verilerle Map<String, Map<String, String>> türü Map Hazırlazan method
    public static Map<String, Map<String, String>> MapHazirla(String uName, String pWord, String uType){
        Map<String, String> tempUserDertails= new HashMap<>();
        Map<String, Map<String, String>> tempUser = new HashMap<>();
        tempUserDertails.put("password", pWord);
        tempUserDertails.put("userType", uType);
        tempUser.put(uName, tempUserDertails);
        return tempUser;
    }
}
