package Day22_Java_Methods;

public class ReplitMethod9 {

    public static char findTheDifference2(String s, String t)
    {        char ch=' ';

        for (int i=0; i<s.length(); i++)
        {
            int a = 0;
            for (int j = 0; j < t.length(); j++)

                if (s.charAt(i)==(t.charAt(j))) a++;
            if (a == 0) ch = s.charAt(i);
        }
        return ch;
    }

    public static char findTheDifference(String s, String t)
    {
        String[] sArr = s.split("");
        String[] tArr = t.split("");
        char ch=' ';

        for (int i=0; i<sArr.length; i++)
        {
            int a = 0;
            for (int j = 0; j < tArr.length; j++)

            if (sArr[i].equals(tArr[j])) a++;
                if (a == 0) ch = s.charAt(i);
        }
        return ch;
    }
        public static void main(String[] args)
    {
        String s = "qawer";
        String t = "rewq";

        System.out.println(findTheDifference(s,t));  // diziye ceviriyor
        System.out.println(findTheDifference2(s,t)); // direk string olarak charAt ile (ama Replit bunu kabul etmedi...)

    }
}
