package Day39_Enum.JavaEnum.Ex2;

public class Ex2Main {

    public static void main(String[] args) {

        User kul1=new User();
        kul1.name="Alperen";
        kul1.yetkisi = Role.ADMIN;
        kul1.durum = Status.ACTIVE;

        User kul2 = new User();
        kul2.yetkisi = Role.CUSTOMER;
        kul2.durum = Status.INACTIVE;



        // Önceden belli olan sabit verilerin
        // atanmasındaki anlama zorluğu yerine
        // bu değerlerin karşılıkları ENUM ile
        // tanımlanarak , atama değeri için kullanılrlar.
        // Bu durum yazma ve anlama kolaylığı sağlar.


    }
}
