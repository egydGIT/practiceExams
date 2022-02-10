package exam03retake01;

public class CdvCheck2 {

    public boolean check(String taxNumber) {
        if (taxNumber.length() != 10) {
            throw new IllegalArgumentException("Taxnumber length should be 10, but now: " + taxNumber.length());
        }
        try {
            String[] temp = taxNumber.split("");
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                int actualNumber = Integer.parseInt(temp[i]);
                int result = actualNumber * (i+1);
                sum += result;
            }
            if ((sum % 11) == Integer.parseInt(temp[9])) {
                return true;
            }
            return false;
        }
        catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Taxnumber should contain just number, but now: " + taxNumber, nfe);
        }
    }
}
