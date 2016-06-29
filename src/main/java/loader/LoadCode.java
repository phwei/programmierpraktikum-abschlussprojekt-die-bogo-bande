package loader;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.scene.control.TextArea;



public class LoadCode {
    public static void loaddata(TextArea texter,String s) {
        final Path path = Paths.get(s + ".txt");
        try {
            texter.setText(String.valueOf(Files.readAllLines(path)));
            System.out.println("Erfolgreich");
        } catch (IOException e) {
            System.out.println("Fehler beim Laden");

        }

    }
}