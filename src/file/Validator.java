package file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Validator {
    public boolean isValidKey(int key, List alphabet){
        if (key > alphabet.size()){
            System.out.println("Ошибка ввода ключа: \nКлюч не может быть больше " +
                    Integer.parseInt(String.valueOf(alphabet.size())) +
                    "\nВведите корректный ключ");
            return false;
        }else
        return true;
    }
    public boolean isExistFile(String filePath){
        if(Files.exists(Path.of(filePath))){
            System.out.println("Файл с таким именем уже существует. Измените имя файла");
            return true;
        }return false;
    }

}
