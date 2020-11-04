package Day54.Odev2;

public class DMGFile implements IReadFile {
    @Override
    public String open() {
        return "DMG dosyasi aciliyor";
    }

    @Override
    public String read() {
        return "DMG dosyasi okunuyor";
    }

    @Override
    public String save() {
        return "DMG dosyasi kaydediliyor";
    }

    @Override
    public String close() {
        return "DMG dosyasi kapaniyor";
    }

    @Override
    public String toString() {
        return open()+"\n"+read()+"\n"+save()+"\n"+close()+"\n";
    }
}
