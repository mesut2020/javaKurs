package Day29_Collections_SetAndMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("name","Mesut Dogan");
        userMap.put("email","medogan@gmail.com");
        userMap.put("address","Rudesheim/Hessen");
        userMap.put("Mobile","0 163 2997346");

        System.out.println("Name = "+userMap.get("name"));
        System.out.println("Adres = "+userMap.get("address"));

        Map<String, String> userMap2 = new HashMap<>();
        userMap2.put("name","Ozlem Dogan");
        userMap2.put("email","ozdogan@gmail.com");
        userMap2.put("address","Rudesheim/Hessen");
        userMap2.put("Mobile","0 163 2997347");

        System.out.println("Name = "+userMap2.get("name"));
        System.out.println("Adres = "+userMap2.get("address"));

        Map<String, Map<String,String>> kartvizitler = new HashMap<>();
        kartvizitler.put("Mesut",userMap);
        kartvizitler.put("Ozlem", userMap2);
        System.out.println(kartvizitler.get("Mesut"));

        String mesutAdres = kartvizitler.get("Mesut").get("address");
        System.out.println("kartvizit = " + mesutAdres);

        System.out.println("Ozlemin ev adresi = " + kartvizitler.get("Ozlem").get("address"));

        kartvizitler.get("Ozlem").put("Mobil","0 163 0000000"); // telefon numarasi degisti...
        System.out.println(" Ozlem kartvizit = " + kartvizitler.get("Ozlem"));

    }
}
