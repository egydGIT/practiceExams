package qualifyingExam0.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        int result = 0;
        if (input == null || input.isBlank()) {
            return result = -1;
        }
        String[] temp = input.split("");
        for (String s : temp) {
            try {
                result += Integer.parseInt(s);
            } catch (NumberFormatException nfe) {
                continue;
            }
        }
        return result;
    }
}
