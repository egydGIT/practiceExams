package exam03retake01;

public class CdvCheck {

    public boolean check(String taxNumber) {
        if (taxNumber.length() != 10 ) {
            throw new IllegalArgumentException("Length is not ok.");
        }
        if (!isNumber(taxNumber)) {
            throw new IllegalArgumentException("Contains not number.");
        }
        int sum = 0;
        int firstNineNumber = 0;
        for (int i = 0; i < taxNumber.length()-1; i++) {
            firstNineNumber = Integer.parseInt(String.valueOf(taxNumber.charAt(i)));
            sum += (i+1) * firstNineNumber;
        }
        int result = sum % 11;
        int lastNumber = Integer.parseInt(String.valueOf(taxNumber.charAt(taxNumber.length()-1)));
        return result == lastNumber;
    }

    private boolean isNumber(String taxNumber) {
        boolean isNumber = true;
        String[] numbers = taxNumber.split("");
        for(String n : numbers) {
            try {
                Integer.parseInt(n);
            }
            catch (NumberFormatException e) {
//                throw new IllegalArgumentException("Contains not number.");
                isNumber = false;
            }
        }
        return isNumber;
    }

    public static void main(String[] args) {

        boolean result = new CdvCheck().check("8365670003");
        System.out.println(result);

        result = new CdvCheck().check("8365670004");
        System.out.println(result);

//        result = new CdvCheck().check("8t65670003");            // Contains not number.
//        result = new CdvCheck().check("65670003");              // Length is not ok.

    }

}
