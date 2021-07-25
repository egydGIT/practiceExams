package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class BalatonStorm {

    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {
        List<String> stations = new ArrayList<>();
        String station = null;
        int level = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            if(line.contains("allomas")) {
                station = line.substring(line.indexOf(":")+3, line.lastIndexOf("\""));
            }
            if(line.contains("level")) {
                level = Integer.parseInt(line.substring(line.indexOf(":")+2, line.indexOf(",")));
                if (level == 3) {
                    stations.add(station);
                }
            }
        }
        Collections.sort(stations, Collator.getInstance(new Locale("hu", "HU")));
        return stations;
    }

}
