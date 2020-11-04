package Day29_Collections_SetAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1_c {
     /*
            // Kullanıcıya
            // 1-Ekleme
            // 2-Listeleme
            // 3-Arama
            // 4-Düzeltme
            // 5-Silme
            // 6-Kayit Tipleri
            // 7-Cikis
            // Seçeneklerini vererek username,password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
            // Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
            // Mainde sadece Seçenekler ve metodların çağrılması olsun.
         */
    public static void menu(){
        System.out.printf("%-30s","_____ Kayit Islem Menusu ____");
        System.out.printf("%5s%s","","__Bilgi ve Cikis__\n");
        System.out.printf("%-17s","1 - Ekleme");
        System.out.printf("%-18s","4 - Düzeltme");
        System.out.printf("%-15s","6 - Kayıt Tipleri\n");
        System.out.printf("%-17s","2 - Listeleme");
        System.out.printf("%-18s","5 - Silme");
        System.out.printf("%-15s\n","7 - Çıkış");
        System.out.printf("%-15s\n\n","3 - Arama");
    }

    public  static boolean userNameCheck(Map<String,Map<String,String>> users,String userName){
        if (users.containsKey(userName)) {
            System.out.print("Kullanici adi sistemde mevcuttur. Lutfen baska bir kullanici adi giriniz...\n");
        }return users.containsKey(userName);
    }

    public static void ekleme(Map<String, Map<String, String>> users){
       //username,password, userType (Müdür, çalışan) ekle...
        Scanner sc=new Scanner(System.in);
        Map<String,String> infoMap = new HashMap<>();
        String pass,pass2,userName="";
        do {
            System.out.print("Kullanici adi giriniz: ");
            userName = sc.nextLine();
        }while (userNameCheck(users,userName));

        do {
            System.out.print("Sifrenizi giriniz: ");
            pass = sc.nextLine();
            System.out.print("Sifrenizi tekrar giriniz: ");
            pass2 = sc.nextLine();
            if(pass2.equals(pass)) System.out.println("Sifreniz onaylandi");
            else System.out.println("Ayni sifreyi girmediniz...");
        }while (!pass2.equals(pass));
        infoMap.put("password",pass);
        System.out.print("Kullanici tipinizi giriniz : ");
        infoMap.put("userType",sc.nextLine());
        System.out.print("Email adresinizi giriniz : ");
        infoMap.put("email",sc.nextLine());
        System.out.print("Telefon numaranizi giriniz : ");
        infoMap.put("tel",sc.nextLine());
        System.out.print("Ev adresinizi giriniz : ");
        infoMap.put("address",sc.nextLine());

        users.put(userName, infoMap);
    }

    public static void listeleme(Map<String,Map<String,String>> users){
        System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%-20s\n","No","User Names","Password","User Type","E-mail","Telefon","Adres");
        System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%-20s\n","--","----------","--------","---------","------","-------","-----");
        int no=1;
        for (Map.Entry<String,Map<String,String>> user:users.entrySet()) {

            System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%-20s\n",no++,user.getKey(),
                    user.getValue().get("password"),user.getValue().get("userType"),
                    user.getValue().get("email"),user.getValue().get("tel"),
                    user.getValue().get("address"));
        }
        System.out.println();
    }

    public static void arama(Map<String, Map<String, String>> users, String src){
        Scanner sc = new Scanner(System.in);
        Map<String,Map<String,String>> srcMap = new HashMap<>();

        for (Map.Entry <String,Map<String,String>> user : users.entrySet()) {
            if(src.equalsIgnoreCase(user.getKey())||src.equalsIgnoreCase(user.getValue().get("email")))
                srcMap.put(user.getKey(),user.getValue());
        }
        if(srcMap.isEmpty()) System.out.println("Aradiginiz \'" +src+"\' bilgisi sistemde kayitli degil. \n");
        else listeleme(srcMap);
    }

    public static void duzeltme(Map<String,Map<String,String>> users){
        Scanner sc = new Scanner(System.in);
        Map<String,String> tempPass = new HashMap<>();
        String userName="";

        while(true) {
            System.out.print("Kullanici adiniz : ");
            userName = sc.nextLine();
            System.out.print("Sifreniz : ");
            String pass = sc.nextLine();
            if(users.containsKey(userName) && users.get(userName).get("password").equals(pass)) break;
            else    System.out.println("Kullanici adinizi veya sifrenizi yanlis girdiniz. Tekrar deneyiniz!!!");
        }
        System.out.println("Merhaba " +userName+",kayitli olan bilgileriniz asagidaki gibidir...");
        arama(users,userName);

        String newUserName,newPass,newEmail;
        System.out.println("Lutfen degistirmek istemediklerinizi bos birakin");
        do {
            System.out.print("Yeni Kullanici adi:");
            newUserName = sc.nextLine();
        }while(userNameCheck(users,newUserName));
        System.out.print("Yeni sifreniz:");
        newPass = sc.nextLine();
        System.out.print("Yeni mail adresiniz:");
        newEmail = sc.nextLine();
        if(newUserName.length()>0) {users.put(newUserName,users.remove(userName));userName=newUserName;}
        if(newPass.length()>0) users.get(userName).put("password", newPass);
        if(newEmail.length()>0) users.get(userName).put("email",newEmail);
        System.out.println("Degisiklikler basariyla kaydedildi. Yeni bilgileriniz...");
        arama(users,userName);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Map<String,String>> users = new HashMap<>(); //username,password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.

        String choice=" ";
        while(!choice.equals("7")){

            menu();

            System.out.print("Yapmak istediginiz islemi seciniz : ");
            choice = sc.nextLine();

/*            if(choice.length()>1){ System.out.println("Lutfen 1 ve 6 arasi bir sayi giriniz. Cikmak icin 7 giriniz.");}
            else {
                char c = choice.charAt(0);
                if (c<'1' || c>'7')  {System.out.println("Lutfen 1 ve 6 arasi bir sayi giriniz. Cikmak icin 7 giriniz.");}
            }*/

            switch (choice){
                case "1":ekleme(users);break;
                case "2":listeleme(users);break;
                case "3":
                    System.out.print("Kullanici adinizi veya email adresinizi giriniz : ");
                    String src = sc.nextLine();
                    arama(users,src);break;
                case "4":duzeltme(users);break;
                default:
                    System.out.println("Lutfen 1 ve 6 arasi bir sayi giriniz. Cikmak icin 7 giriniz...\n");
            }

        }
    }

}
