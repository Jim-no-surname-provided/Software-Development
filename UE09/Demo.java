import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) {
        try {
            readFunnyThings();
        } catch (NeAndereException e) {
            e.printStackTrace();
        }
    }

    public static void readFunnyThings() throws NeAndereException {
        try {
            Files.readAllLines(Paths.get("idonotexist.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Klasse.wirftNeAndereException();
    }
}