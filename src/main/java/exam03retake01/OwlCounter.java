package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> countDatas = new HashMap<>();

    public void readFromFile(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] temp = line.split("=");
            countDatas.put(temp[0], Integer.parseInt(temp[1]));
        }
    }

    public int getNumberOfOwls(String country) {
        int result = 0;
        for(Map.Entry entry : countDatas.entrySet()) {
            if(entry.getKey().equals(country)) {
                result = (int) entry.getValue();
            }
        }
        return result;
    }

    public Map<String, Integer> getCountDatas() {
        return countDatas;
    }


    public static void main(String[] args) {

        OwlCounter owlCounter = new OwlCounter();
        try (BufferedReader reader = Files.newBufferedReader(Path.of("src/test/resources/exam03retake01/owls.txt"))) {
            owlCounter.readFromFile(reader);
            System.out.println(owlCounter.getCountDatas());
        } catch (IOException e) {
            throw new NullPointerException("Can not find file.");
        }

//        {Heves=97, Somogy=893, Békés=980, Csongrád-Csanád=201, Hajdú-Bihar=66, Vas=834, Jász-Nagykun-Szolnok=950, Pest=434,
//        Győr-Moson-Sopron=902, Komárom-Esztergom=846, Zala=135, Tolna=254, Nógrád=437, Borsod-Abaúj-Zemplén=600, Baranya=1050,
//        Szabolcs-Szatmár-Bereg=438, Fejér=810, Bács-Kiskun=1000, Veszprém=483}

        System.out.println(owlCounter.getNumberOfOwls("Heves"));        // 97
        System.out.println(owlCounter.getNumberOfOwls("Somogy"));       // 893

    }
}
