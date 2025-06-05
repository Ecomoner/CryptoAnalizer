import cipher.Cipher;
import contains.Contains;
import file.FileManager;
import file.Validator;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainApp {
    public static void main(String[] args) {
        Cipher cipher = new Cipher();
        Validator validator = new Validator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите функцию: \n" +
                "1. Шифрование\n" +
                "2. Расшифровка с ключом\n" +
                "3. Brute force\n" +
                "0. Закрыть программу");
        int number = Integer.parseInt(scanner.nextLine());
        String filePath;
        String outputPath;
        int key;
        while (true) {
            switch (number){
                case (1):
                    System.out.println("Введите путь для исходного текста: ");
                    filePath = scanner.nextLine();
                    System.out.println("Введите путь для зашифрованого текста: ");
                    outputPath = scanner.nextLine();
                    System.out.println("Введите ключ: ");
                    key = Integer.parseInt(scanner.nextLine());
                    if (validator.isValidKey(key, Contains.ALPHABET) && validator.isExistFile(outputPath)){
                        cipher.encrypt(filePath,outputPath,key);
                        continue;
                    }
                case (2):
                    System.out.println("Введите путь для зашифрованного текста: ");
                    filePath = scanner.nextLine();
                    System.out.println("Введите путь для расшифрованого текста: ");
                    outputPath = scanner.nextLine();
                    System.out.println("Введите ключ: ");
                    key = scanner.nextInt();
                    if (validator.isValidKey(key, Contains.ALPHABET) && validator.isExistFile(outputPath)){
                        cipher.encrypt(filePath,outputPath,key);
                        continue;
                    }
                case (3):
                    System.out.println("Введите путь для зашифрованного текста: ");
                    filePath = scanner.nextLine();
                    System.out.println("Введите путь для расшифрованного текста: ");
                    outputPath = scanner.nextLine();
                    if (validator.isExistFile(outputPath)) {
                        cipher.brutForceDecrypt(filePath,outputPath);
                        continue;
                    }
                case (0):
                    break;
            }
            break;
        }
    }
}