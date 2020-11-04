package Day47_Encapsulation.Replit;

import java.util.Scanner;

public class Replit_Encapsulation4 {
/*
    Burada iki adet class vardır. Biri Main diğeri ise rentApartments

    rentApartments'ın içinde;
    Bu variable'ları private olarak oluşturun;
    String name    int roomCount    boolean balconyOrNo
    Bütün variable'lar için getter ve setter oluşturunuz.

    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
-----------------------------------------------------------------
    Bir method oluşturun;
    Eğer room sayısı 0 ise,   rent(kira) 1400
    Eğer oda sayısı 1 ise,    rent  1700
    Eğer oda sayısı 2 ise,    rent 2200
    Eğer oda sayısı 3 ise,    rent 2700

    rent'i return'leyin.
----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,    rent'e 200 dollar ekleyin.

    Main class'ın içinde;
    userName rent is amountOfRent
*/

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int roomCount = scan.nextInt();   // int roomCount = scan.nextLine(); sorunun orjinali bu sekilde... hatali gibi
        boolean balconyOrNo = scan.nextBoolean();

//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.

        rentApartments apt = new rentApartments(name,roomCount,balconyOrNo);

        System.out.println(apt.getName()+" rent is "+ rent(apt.getRoomCount(),apt.isBalconyOrNo()));



    }

    public static int rent(int roomCount, boolean balconyOrNo){
        int rent =0;
        if (roomCount==0) rent = 1400;
        else if (roomCount==1) rent = 1700;
        else if (roomCount==2) rent = 2200;
        else return rent =2700;
        return rent+=balcony(balconyOrNo);
    }

    public static int balcony(boolean balconyOrNo){

        if (balconyOrNo) return 200;
        else return 0;
    }
}

    class rentApartments{
        private String name;
        private int roomCount;
        private boolean balconyOrNo;

        public rentApartments(String name, int roomCount, boolean balconyOrNo) {
            setName(name);
            setRoomCount(roomCount);
            setBalconyOrNo(balconyOrNo);
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }

        public int getRoomCount(){
            return roomCount;
        }
        public void setRoomCount(int roomCount) {
            this.roomCount = roomCount;
        }

        public boolean isBalconyOrNo(){
            return balconyOrNo;
        }

        public void setBalconyOrNo(boolean balconyOrNo) {
            this.balconyOrNo = balconyOrNo;
        }
    }


