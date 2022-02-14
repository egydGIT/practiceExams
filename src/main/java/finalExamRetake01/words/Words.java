package finalExamRetake01.words;

public class Words {

    public boolean hasMoreDigits(String word) {
        int digitCounter = 0;
        int charCounter = 0;
        for (char c : word.toCharArray()) {
            if (isDigit(c)) {
                digitCounter++;
            } else {
                charCounter++;
            }
        }
        return digitCounter > charCounter ? true : false;
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
