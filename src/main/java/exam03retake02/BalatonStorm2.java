package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

public class BalatonStorm2 {

    private Map<String, Integer> stations = new HashMap<>();

    public List<String>  getStationsInStorm(BufferedReader reader) {
        String line;
        String stationName = null;
        Integer level = 0;
        try {
            getStationsWithLevelInMap(reader, stationName);
            List<String> filteredStations = getFilteredStations();
            Collections.sort(filteredStations, Collator.getInstance(new Locale("HU", "hu")));
            return filteredStations;
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file. ", e);
        }
    }

    private List<String> getFilteredStations() {
        List<String> filteredStations = new ArrayList<>();
        for (Map.Entry entry : stations.entrySet()) {
            String name = (String) entry.getKey();
            int value = (int) entry.getValue();
            if (value == 3) {
                filteredStations.add(name);
            }
        }
        return filteredStations;
    }

    private void getStationsWithLevelInMap(BufferedReader reader, String stationName) throws IOException {
        Integer level;
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("allomas")) {
                stationName = line.substring(line.indexOf(":")+3, line.lastIndexOf("\""));
                stations.put(stationName, 0);
            }
            if (line.contains("level")) {
                level = Integer.parseInt(line.substring(line.indexOf(":")+2, line.indexOf(",")));
                stations.put(stationName, stations.get(stationName) + level);
            }
        }
    }

    public static void main(String[] args) {

        BalatonStorm2 bs = new BalatonStorm2();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(BalatonStorm2.class.getResourceAsStream("storm.json")))) {
            System.out.println(bs.getStationsInStorm(reader));
            /*
            [Ábrahámhegy, Balatonfüred, Balatonszárszó]
             */

        } catch (IOException io) {
            throw new IllegalArgumentException("Can not read file. ", io);
        }

    }
}

