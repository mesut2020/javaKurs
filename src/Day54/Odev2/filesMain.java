package Day54.Odev2;

public class filesMain {
    public static void main(String[] args) {
        TxtFile txt = new TxtFile();
        PowerPointFile ppt = new PowerPointFile();
        DMGFile dgm = new DMGFile();
        EXEFile exe = new EXEFile();

        System.out.println(txt);
        System.out.println(ppt);
        System.out.println(dgm);
        System.out.println(exe);

    }
}
