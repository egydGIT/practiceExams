package finalExamRetake01.cleaning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CleaningService {

    private List<Cleanable> cleanables = new ArrayList<>();

    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }

    public int cleanAll() {
        Iterator<Cleanable> iter = cleanables.iterator();
        int sumPrice = 0;
        while (iter.hasNext()) {
            Cleanable actual = iter.next();
            sumPrice += actual.clean();
            iter.remove();
        }
        return sumPrice;
    }

    public int cleanOnlyOffices() {
        Iterator<Cleanable> iter = cleanables.iterator();
        int sumPrice = 0;
        while (iter.hasNext()) {
            Cleanable actual = iter.next();
            if (actual.getType() == Type.OFFICE) {
                sumPrice += actual.clean();
                iter.remove();
            }
        }
        return sumPrice;
    }

    public List<Cleanable> findByAddressPart(String address) {
        List<Cleanable> result = new ArrayList<>();
        for (Cleanable cleanable : cleanables) {
            if (cleanable.getAddress().contains(address)) {
                result.add(cleanable);
            }
        }
        return result;
    }

    public String getAddresses() {
        StringBuilder sb = new StringBuilder();
        for (Cleanable cleanable : cleanables) {
            sb.append(cleanable.getAddress()).append(", ");
        }
        String stringWithoutComma = getString(sb);
        return stringWithoutComma;
    }

    private String getString(StringBuilder sb) {
        String result = sb.toString();
        int stringSizeWithComma = result.length();
        if (result.length() == 0) {
            return "";
        }
        String stringWithoutComma = result.substring(0, stringSizeWithComma-2);
        return stringWithoutComma;
    }

    public List<Cleanable> getCleanables() {
        return cleanables;
    }
}
