package Day47_Encapsulation.task2;

public class Banka {
    public static void main(String[] args) {
        // 1- Bir ACcount sinifi olusturun. fields: number ve balance
        // 2- bir contructor ekleyin.
        // 3- Account sinifina deposit metdou ekle
        // 4- Account sinifina withDraw (ParaCikar) metodu ekleyin.
        // 5- Deposit 5000 in uzerine limit disina ciktiniz uyarisi...
        // 6- Main metodunda 2 account olusturarak, ihtimalleri deneyiniz.

        Account account = new Account();
        
        account.deposit(4000);
        System.out.println("Bakiyeniz = " + account.getBalance());
        try {
            account.withDraw(3000);
            System.out.println("Kalan bakiye = " + account.getBalance());
            }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
