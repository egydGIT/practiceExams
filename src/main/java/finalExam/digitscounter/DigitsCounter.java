package finalExam.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        if(s == null || s.isBlank()) {
            return 0;
        }
        String[] temp = s.split("");
        Set<Integer> sorted = new HashSet<>();
        for(String t : temp) {
            try {
                sorted.add(Integer.parseInt(t));
            }
            catch (NumberFormatException e) {
                continue;
            }
        }
        return sorted.size();
    }

}
