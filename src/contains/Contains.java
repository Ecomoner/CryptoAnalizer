package contains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contains {
    private static final Character[] ALPHABET_RU = {'а', 'б',
            'в','г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»'};
    private static final Character[] ALPHABET_ENG = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o',
            'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z'};
    private static final Character[] ALPHABET_NUM = {'1', '2', '3', '4', '5', '6', '7', '8',
            '9', '0', '(', ')', '-', '=', '|',
            '\\', '{', '}', '[', ']', '!', '@',
            '#', '$', '%', '*', ';', ':', '"',
            '!', '?', ' ' };

    public static final List<Character> ALPHABET = new ArrayList<>();
    static {
        ALPHABET.addAll(Arrays.asList(ALPHABET_RU));
        ALPHABET.addAll(Arrays.asList(ALPHABET_ENG));
        ALPHABET.addAll(Arrays.asList(ALPHABET_NUM));
    }

}
