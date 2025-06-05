package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {
    public String readFile(String inputFile){
        try {
            String pathFile = Files.readString(Path.of(inputFile));
            return pathFile;
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            return null;
        }
    }
    public void writeFile(String text, String outputFile) {
        try {
                Files.write(Path.of(outputFile), text.getBytes());
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
