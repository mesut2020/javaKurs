package Day43_StringBuilder_StringBuffer_JavaExceptions_TryCatch_MultiCatch.BuilderAndBuffer;

import java.util.Arrays;

public class JavaStrings_1 {

    public static void main(String[] args) {
        /*     String = daha yavas ,Immutable==> degisemez,

            StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
            StringBuffer synchronized,thread safe.

           StringBuilders = mutable==>degisebilir ,
           not senkronized/not thread safe,fakat more efficient
           
           s.append(4); // ne eklenirse eklensin STRINGE cevirir.
*/
        
        StringBuilder s = new StringBuilder("Bu");
        
        s.append("gun");
        s.append(" hava");
        s.append(" cok sicak");

        System.out.println("s = " + s);  //s = Bu gun hava cok sicak        

        System.out.println(".s.length() = " + s.length());
        
        s.append(4); // ne eklenirse eklensin stringe cevirir.
        
        s.reverse();
        System.out.println("s = " + s);  //s = 4kacis koc avah nuguB

        s.delete(0, 5);
        System.out.println("s.delete = " + s); //s.delete = s koc avah nuguB

        s.deleteCharAt(3);
        System.out.println("s.deleteCharAt = " + s); //s.delete = s koc avah nuguB

        System.out.println("s.length() = " + s.length());
        System.out.println("s.capacity() = " + s.capacity());

        s.setLength(9);
        System.out.println("s.setLength(9); = " + s);
        
        s.insert(5, 545);
        System.out.println("s = " + s);
        
        int[] array = {1,2,3,4,5};
        
        s.insert(6, Arrays.toString(array));
        System.out.println("array = " + array);
    }
}
