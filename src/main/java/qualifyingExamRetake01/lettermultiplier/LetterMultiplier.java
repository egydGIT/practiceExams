package qualifyingExamRetake01.lettermultiplier;

public class LetterMultiplier {

    public String multiply(String input, int number) {
        if (input == null || input.isBlank() || number < 0) {
            throw new IllegalArgumentException("Wrong parameters. ");
        }
        StringBuilder sb = new StringBuilder();
        String[] temp = input.split("");
        for (String s : temp) {
           sb.append(s.repeat(number));
        }
        return sb.toString();
    }
}
