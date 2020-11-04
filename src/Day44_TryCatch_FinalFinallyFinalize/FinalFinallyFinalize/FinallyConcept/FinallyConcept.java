package Day44_TryCatch_FinalFinallyFinalize.FinalFinallyFinalize.FinallyConcept;


// finally is a block
public class FinallyConcept {
    public static void main(String[] args) {
//        test1();
//        test2();
//        division();
        nullPointerException ();
    }

    public static void test1(){   // static to call directly
        try{
            System.out.println("inside test1 method");
            throw new RuntimeException("test");
        }
        catch (Exception e){
            System.out.println("inside the catch block");
        }

        finally {
            System.out.println("inside finally block");
        }
    }

    public static void test2(){

        try{
            System.out.println("inside test2");
        }
        finally{
            System.out.println("finally code in test2 moethod");
        }
    }


    public static void division (){
        int i =10;
        try{
            System.out.println("inside try block");
            int k=i/0;
        }
        catch(ArithmeticException e){
            System.out.println("inside catch block");
            System.out.println("divide by zero error");
        }
        finally {
            System.out.println("execute this code even after any exception");
        }
    }

    public static void nullPointerException (){
        int i =10;
        try{
            System.out.println("inside try block");
            int k= i;
        }
        catch(ArithmeticException e){
            System.out.println("inside catch block");
            System.out.println("divide by zero error");
        }
        finally {
            System.out.println("execute this code even after any exception");
        }
    }
}
