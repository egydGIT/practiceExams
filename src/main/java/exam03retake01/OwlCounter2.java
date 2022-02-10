package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter2 {

    private Map<String, Integer> countedOwls = new HashMap<>();

    public void readFromFile(BufferedReader reader) {
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                String[] temp = line.split("=");
                countedOwls.put(temp[0], Integer.parseInt(temp[1]));
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file. ", e);
        }
    }

    public int getNumberOfOwls(String country) {
        return countedOwls.get(country);
    }

}
