package Day46_Encapsulation.tasks.task1;

public class User {
    // 1- field leri asagidaki gibi User class olustur
    // 2- butun fieldleri parametre olan constructor
    // 3- butun fieldler icin GetterSetter metodu olsuturun
    // 4- UserMain isminde main icin bir class olsusturun.
    // 5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
    //    active ve signedIn default olarak true, false atayabilirsiniz.
    //    id yi sistem otomatik versin.,
    // 6- eğer password 6 dan küçük olursa yeniden userı girsin.passwordun
    //    6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.
    // 7-  Adım, sadece passwordu istesin nasıl yapardınız
    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

    private static int sayac = 1;

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
        setId(); // buraya yazarsak password de hata varsa sayac artmamis olur.
        setActive(true);
        setSignedIn(false);
    }

    public int getId() {
                return id;
    }

    public void setId() {
        this.id = sayac++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()<6)
            throw new RuntimeException("Pasword 6 karakterden az olamaz..");

        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return
                "\nid = " + getId() +
                "\nusername = " + getUsername() +
                "\npassword = " + getPassword() +
                "\nactive = " + isActive() +
                "\nsignedIn = " + isSignedIn() ;
    }
}
