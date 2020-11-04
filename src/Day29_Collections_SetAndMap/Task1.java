package Day29_Collections_SetAndMap;
// Kullaniciya
// 1- Ekleme
// 2- Listeleme
// 3- Arama
// 4- Duzeltme
// 5- Cikis
// Seceneklerini vererek username, password ve LoginCount dan olusan bir Map tanimlayiniz...
// Kullanicinin secimine gore her bir islemi ayri metodda yaotirin
// Main de sadece Secenekler ve metodlar cagrilamasi olsun


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void ekleme(Map<String,Map<String, String>> users){

        Scanner sc = new Scanner(System.in);

        System.out.print("Username = ");
        String username = sc.nextLine();

        System.out.print("Password = ");
        String password = sc.nextLine();

        System.out.print("User Type = ");
        String userType = sc.nextLine();

        Map<String,String> infoMap = new HashMap<>(); // burada bir kartvizit gibi map'e atıldı
        infoMap.put("password",password);
        infoMap.put("userType",userType);

        users.put(username, infoMap); // burada kullanıcının verdiği isme kartvizit gibi bilgiler atıldı
    }

    public static void listeleme(Map<String, Map<String,String>>  users )
    {

        System.out.println("users = " + users);
    }

    public static void arama(Map<String, Map<String,String>>  users)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Aramak istediginiz kisiyi giriniz...\nUsername = ");
        String username= sc.nextLine();

        System.out.println(users.get(username));
    }

    public static void duzeltme(Map<String, Map<String,String>>  users)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Degisiklik yapmak icin username inizi giriniz...\nUsername = ");
        String username= sc.nextLine();

        System.out.print("Yeni sifrenizi giriniz..:");
        String newPassword = sc.nextLine();

        System.out.print("Yeni UserType giriniz..:");
        String newUserType = sc.nextLine();

        users.get(username).put("password",newPassword);
        users.get(username).put("userType",newUserType);

        System.out.println("Degisiklikler yapildi.\n" +users.get(username)+" olarak degsitirildi..." );
    }


        public static void main(String[] args) {
        // username, password, loginCount
        Map<String,Map<String, String>> users = new HashMap<>();
        String chooseStr="";
        int choose =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("*** MENU ***\n1- Ekleme\n" +
                    "2- Listeleme\n" +
                    "3- Arama\n" +
                    "4- Duzeltme\n" +
                    "5- Cikis!!!" +
                    "\n\nSeciminiz = ");
            chooseStr = sc.nextLine();

            // Girilenin harf olup olmadigi veya 1-5 arasi girip girmedigi kontrol ediliyor...
            if (chooseStr.length() > 1) {
                System.out.println("Yanlis girdiniz");
                continue;
            }
            else {
                char[] ch=chooseStr.toCharArray();
                if(ch[0]<49 || ch[0]>52){
                    System.out.println("Lutfen 1 ile 4 arasi sayi giriniz");
                continue;}
            }

            choose = Integer.parseInt(chooseStr);

            switch (choose) {
                case 1: ekleme(users);
                        break;
                case 2: listeleme(users);
                        break;
                case 3:arama(users); // Kullanıcıdan bir username alıp bunun bilgilerinin görüntülenmesi sağlanacak
                        break;
                case 4:duzeltme(users); // Kullanıcıdan bir username alıp bunun bilgilerinin değiştirilmesi sağlanacak
                        break;
            }
        }while(choose!=5);

    }
}