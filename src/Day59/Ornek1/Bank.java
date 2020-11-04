package Day59.Ornek1;

public abstract class Bank {
    private String name;
    private String phoneNumber;
    private String address;
    private int numEmployee;
    private double balance;
    private int accountNo;

    public Bank(String name, String phoneNumber, String address) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setAddress(address);
    }

    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(int sayac) {

        this.numEmployee=sayac;
    }

    public double getBalance() {
        return balance;
    }

    public String withdraw(double gidenPara) {
        if(gidenPara>balance) return "Bakiyeniz yetersiz. Bakiyeniz: "+balance;
        else {
            this.balance -= gidenPara;
            return gidenPara + " Euro cekildi...";
        }
    }

     public String deposit(double gelenPara) {
        this.balance+= gelenPara;
        return gelenPara +" Euro hesaba yatirildi...";
    }

     public String loan(){
        return "kredi cekilebilir...";
    }

    public abstract void openAccount();
    public abstract boolean closeAccount();


    public void yaz() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-20s%-10s\n",
                getClass().getSimpleName(),getNumEmployee(),getAccountNo(),getName(),
                getPhoneNumber(),getAddress(),getBalance() );
    }
}
