package Day39_Enum.JavaEnum.Ex4;

public enum Months {
    OCAK(31,15),
    SUBAT(28,5),
    MART(31,9),
    NISAN(30,3),
    MAYIS(30,1),
    HAZIRAN(30,9),
    TEMMUZ(31,5),
    AGUSTOS(31,9),
    EYLUL(30,5),
    EKIM(31,4),
    KASIM(30,7),
    ARLAIK(31,9);

    int days;
    int sicaklik;
    // bu bolum atma yapildigi zaman calisir
    Months(int gunMiktari,int sicaklik){
        days = gunMiktari;
        sicaklik = sicaklik;
    }

    void getGunMiktari(){
        System.out.println("days = " +days);
        System.out.println("sicaklik = " +sicaklik);
    }
}
