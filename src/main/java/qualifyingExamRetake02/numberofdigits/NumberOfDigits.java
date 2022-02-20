package qualifyingExamRetake02.numberofdigits;

public class NumberOfDigits {

    public int getNumberOfDigits(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            int numberLength = String.valueOf(i).length();
            counter += numberLength;
        }
        return counter;
    }

    public static void main(String[] args) {
        NumberOfDigits nd = new NumberOfDigits();
        System.out.println(nd.getNumberOfDigits(1));
        System.out.println(nd.getNumberOfDigits(10));
        System.out.println(nd.getNumberOfDigits(12));

    }
}
