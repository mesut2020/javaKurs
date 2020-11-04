package Day54.Odev2;

public class EXEFile implements IReadFile{


    @Override
    public String open() {
        return "EXE dosyasi aciliyor";
    }

    @Override
    public String read() {
        return "EXE dosyasi okunuyor";
    }

    @Override
    public String save() {
        return "EXE dosyasi kaydediliyor";
    }

    @Override
    public String close() {
        return "EXE dosyasi kapaniyor";
    }

    @Override
    public String toString() {
        return open()+"\n"+read()+"\n"+save()+"\n"+close()+"\n";
    }
}
