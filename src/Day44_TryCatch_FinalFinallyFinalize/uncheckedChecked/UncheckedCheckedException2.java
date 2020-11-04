package Day44_TryCatch_FinalFinallyFinalize.uncheckedChecked;

import java.io.FileInputStream;

public class UncheckedCheckedException2 {
    public static void main(String[] args) {
        // Checked Exception :
        // Dosya okuma/yazma islemi
        // bu islemlerde hata olasiligi yuksek oldugundan hata kontrolu zorunlu tutuluyor...
        // bu yuzden try-catch zorunlu
try {
    FileInputStream file = new FileInputStream("dosya.txt");
}
catch (Exception e){
    System.out.println("Dosya okuma hatasi...");
}

    }
}
