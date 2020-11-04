package Day37_Public_default_friendly_private.instanceModifiers.privateModifier.same;

public class Company {
    public static void main(String[] args) {
        Person personel = new Person();
        personel.id = 1;
        personel.name="Ahmet";
        personel.userName = "ahmet";
        //personel.password = "1234"; // burasi private oldugundan direk erisilemez...

        personel.SifreBelirle("1234abcd");
        personel.SifreGoster();

    }
}
