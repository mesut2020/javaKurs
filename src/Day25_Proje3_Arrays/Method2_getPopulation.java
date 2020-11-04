package Day25_Proje3_Arrays;

public class Method2_getPopulation {

    public static int getPopulation(String[] countryNames,int[] countryPopulations, String country){
        int pop = 0;

        for (int i = 0; i < countryNames.length; i++)
        {
            if(countryNames[i].equalsIgnoreCase(country))
                pop = countryPopulations[i];

        }

        return pop;
    }

    public static void main(String[] args) {
        /*getPopulation:
        main de aşağıdaki isimlerle Array leri tanımlayınız.Verilen örnek değerleri kullanabilirsiniz.
        countryNames Ülke isimleri
        countryPopulations Ülke nüfusları
        populationOfCountry adında bir metod yaznız.
                Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (ulkeAdi) alacak
        Eğer Ülke adı countryNames de var ise, aynı sıradaki ülke nüfusunu diğer Array den bulup geri
        göndersin.

                Ornegin;
        countryNames = {"USA" ,"Mexico" ,"Canada"}
        countryPopulations = {100000 , 120000 , 130000}
        str = "Mexico"
        return 120000 olmali
        NOT : eger (ulkeAdi) icin verilen ulke countryNames icinde yoksa return -1 olmali
*/

        String [] countryNames = {"USA" ,"Mexico" ,"Canada"};
        int[] countryPopulations = {100000 , 120000 , 130000};
        String country = "Mexico";

        System.out.println(getPopulation(countryNames,countryPopulations,country));

    }
}
