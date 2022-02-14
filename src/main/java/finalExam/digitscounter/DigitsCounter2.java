package finalExam.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter2 {

    public int getCountOfDigits(String word) {
        if (word == null || word.isBlank()) {
            return 0;
        }
        Set<Character> differentChars = new HashSet<>();
        for (Character c : word.toCharArray()) {
            if (c >= '0' && c <= '9') {
                differentChars.add(c);
            }
        }
        return differentChars.size();
    }

    public int getCountOfDigits2(String word) {
        if (word == null || word.isBlank()) {
            return 0;
        }
        Set<Integer> differentChars = new HashSet<>();
        for (Character c : word.toCharArray()) {
            try {
                int number = Integer.parseInt(String.valueOf(c));
                differentChars.add(number);
            } catch (NumberFormatException nfe) {
                continue;
            }

        }
        return differentChars.size();
    }


}
