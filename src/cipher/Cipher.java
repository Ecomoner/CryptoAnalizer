package cipher;

import contains.Contains;
import file.FileManager;
import file.Validator;

public class Cipher {
    FileManager fileManager = new FileManager();
    Validator validator = new Validator();

    public void encrypt(String inputFile,String outputFile, int key) {
        String text = fileManager.readFile(inputFile);
        StringBuilder encText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            int index = Contains.ALPHABET.indexOf(ch);
            if (index != -1) {
                int newIndex = (index + key) % Contains.ALPHABET.size();
                encText.append(Contains.ALPHABET.get(newIndex));
            } else {
                encText.append(ch);
            }
            fileManager.writeFile(encText.toString(), outputFile);
        }
    }

    public void decrypt(String inputFile,String outputFile, int key) {
        String text = fileManager.readFile(inputFile);
        StringBuilder decText = new StringBuilder();

        for (char ch : text.toCharArray()) {
            int index = Contains.ALPHABET.indexOf(ch);
            if (index != -1) {
                int newIndex = (index - key + Contains.ALPHABET.size()) % Contains.ALPHABET.size();
                decText.append(Contains.ALPHABET.get(newIndex));
            } else {
                decText.append(ch);
            }
        }
        fileManager.writeFile(decText.toString(), outputFile);
    }
    public void brutForceDecrypt(String inputFile,String outputFile){
        String text = fileManager.readFile(inputFile);
        StringBuilder decText = new StringBuilder();
        int brutKey = 0;
        while (brutKey < Contains.ALPHABET.size()){
            decText.append("\n\n" + "Ключ: " + brutKey + "\n");
            for (char ch : text.toCharArray()) {
                int index = Contains.ALPHABET.indexOf(ch);
                if (index != -1) {
                    int newIndex = (index - brutKey + Contains.ALPHABET.size()) % Contains.ALPHABET.size();
                    decText.append(Contains.ALPHABET.get(newIndex));
                } else {
                    decText.append(ch);
                }
            }
            fileManager.writeFile(decText.toString(), outputFile);
            brutKey++;
        }
    }
}
