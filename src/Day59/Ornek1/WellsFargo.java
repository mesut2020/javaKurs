package Day59.Ornek1;

public class WellsFargo extends Bank {
    static int sayac=1;

    public WellsFargo(String name, String phoneNumber, String address) {
        super(name, phoneNumber, address);
        this.setNumEmployee(sayac++);
        this.setAccountNo((int)(Math.random()*100000000)+300000000);
        openAccount();
    }

    @Override
    public void openAccount() {
        System.out.println("Adiniz ve adres bilgileriniz alindi.\n Wells Fargo da hesabiniz acildi. Hayirli olsun...");
    }

    @Override
    public boolean closeAccount() {
        System.out.println("Hesap kapatma icin telabiniz alindi...");
        if(getBalance()>0) {
            System.out.println("Hesabinizi kapatmak icin bakiyenizi sifrilamaniz gerekli. Bakiyeniz: " + getBalance());
            return false;
        }
        else {
            System.out.println("Wells Fargo daki hesabiniz kapatildi. Tekrar bekleriz...");
            return true;
        }
    }
}
