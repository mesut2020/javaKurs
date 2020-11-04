package Burak.Non_AccessModifiers.Static;

public class internetSitesi {

    // TODO: Static nesne'ye özel değildir. Sınıfa özeldir. Ne kadar nesne olursa olsun aynı belleği kullanır.

    // TODO: Static method içerisine sadece static olan diğer değişkenler ve methodlar çağırılabilir.

    static String username;
    static int password;

    public  static void userInfo(){

        username = "burakturkmen";
        password = 1243123;

        System.out.println("Kullanıcı adı: " + username + "\n" + "Kullanıcı şifresi: " + password);

    }





}
