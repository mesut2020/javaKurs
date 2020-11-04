package Day37_Public_default_friendly_private.instanceModifiers.privateModifier.same;

public class Person {
    int id;
    String name;
    String userName;
    private String password;

    public void SifreBelirle(String sifre){
        if (sifre.length() >=8 && sifre.contains("[a-zA-Z]+"))
        {
            this.password = sifre;
        }
        else
        {
            System.out.println("En az 8 karakter olmali ve harf icermeli...");
        }
    }
    public void SifreGoster() {
        if (this.password != null)
            System.out.println("****"+this.password.substring(4));
    }
}
