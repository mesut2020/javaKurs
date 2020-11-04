package Day32_ClassAndObjects.tasks.task2;

public class Task2 {
    // 1. Adim: ayri dosyada olmak uzere Customer (fields: name) isimli bir class tanimlayiniz.
    // 2. Adim: ayri bir dosyada ElectricityAccount (fields: totalKw, rate, bill)
    // 3. Adim: Customer a bir ElectricityAccount ekleyiniz.
    // 4. Adim: 1 tane musteri olusturunuz. Account u dahil
    // 5. Adim: Musteriye ait her ay tuketilen enerjiyi toplayacak bir metod yaziniz...
    //          tuketimEkle metodu: her verilen aylik rakami toplasin.
    // 6. Adim: Odenecek rakami toplam tuketimi rate ile carparak hesaplayip, main de yaziniz...

    public static void main(String[] args) {
        Customer custom1 = new Customer();
        custom1.name = "Kaya";
        custom1.elecAccount = new ElectricityAccount();
        
        custom1.elecAccount.tuketimEkle(100); // Ocak ayi tuketimi
        custom1.elecAccount.tuketimEkle(150); // Subat ayi tuketimi

        System.out.println(custom1.name+ "'nin tukettigi enerji miktari = " + custom1.elecAccount.totalKw);

        System.out.println("custom1.elecAccount.totalBill() = " + custom1.elecAccount.totalBill());

    }
}
