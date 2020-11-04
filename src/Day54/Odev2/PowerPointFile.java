package Day54.Odev2;

public class PowerPointFile implements IReadFile{
    @Override
    public String open() {
        return "PowerPoint dosyasi aciliyor";
    }

    @Override
    public String read() {
        return "PowerPoint dosyasi okunuyor";
    }

    @Override
    public String save() {
        return "PowerPoint dosyasi kaydediliyor";
    }

    @Override
    public String close() {
        return "PowerPoint dosyasi kapaniyor";
    }

    @Override
    public String toString() {
        return open()+"\n"+read()+"\n"+save()+"\n"+close()+"\n";
    }
}
