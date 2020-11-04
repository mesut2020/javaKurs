
package Day55_AbstractClass;

interface HasTail {
    int getTailLength();
}
  class Puma implements HasTail {
 public int getTailLength() {return 4;}
 }
 public class OCA_Q3 extends Puma {

 public static void main(String[] args) {
         Puma puma = new Puma();
         System.out.println(puma.getTailLength());

     OCA_Q3 oca = new OCA_Q3();
     System.out.println(oca.getTailLength());
         }

        public int getTailLength(int length) {return 2;}
 }


