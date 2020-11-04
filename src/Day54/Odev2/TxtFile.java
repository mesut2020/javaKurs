package Day54.Odev2;

public class TxtFile implements IReadFile {

    @Override
    public String open() {
        return "Text dosyasi aciliyor";
    }

    @Override
    public String read() {
        return "Text dosyasi okunuyor";
    }

    @Override
    public String save() {
        return "Text dosyasi kaydediliyor";
    }

    @Override
    public String close() {
        return "Text dosyasi kapaniyor";
    }

    @Override
    public String toString() {
        return open()+"\n"+read()+"\n"+save()+"\n"+close()+"\n";
    }

}
