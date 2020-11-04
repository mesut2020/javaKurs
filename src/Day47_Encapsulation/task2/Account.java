package Day47_Encapsulation.task2;

public class Account {
    int accountNo;
    private double balance;

    public static int Number=1;

    public Account() {
        this.accountNo =Number++;
    }

    public void deposit(double inComming){
        this.balance += inComming;
    }

    public void withDraw(double outComming){
        if(outComming>this.balance)
            throw new RuntimeException("Yetersiz bakiye...");

        if(outComming > 5000)
            throw new RuntimeException("Gunluk limiti astiniz...");

        this.balance -= outComming;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNo() {
        return accountNo;
    }
}
