package finalExamRetake02.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> uniqueChars(String word) {
        if (word == null || word.isBlank()) {
            throw new IllegalArgumentException("Parameter can not be empty. ");
        }
        List<Character> characters = new ArrayList<>();
        for (Character c : word.toCharArray()) {
            if (!characters.contains(c)) {
                characters.add(c);
            }
        }
        return characters;
    }



}
