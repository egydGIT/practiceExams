package finalExam.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WorkHours2 {

    private List<Data2> datas = new ArrayList<>();

    public String minWork(String file) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(file))) {
            readFile(reader);
            Data2 found = getWorkerWithMinHours();
            return getResult(found);
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file. ", e);
        }
    }

    private String getResult(Data2 found) {
        return found.getName() + ": " + found.getDate();
    }

    private Data2 getWorkerWithMinHours() {
        int min = 25;
        Data2 found = null;
        for (Data2 data : datas) {
            if (data.getWorkHours() < min) {
                min = data.getWorkHours();
                found = data;
            }
        }
        if (found == null || datas.isEmpty()) {
            throw new IllegalArgumentException("Problem in search. ");
        }
        return found;
    }

    private void readFile(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] temp = line.split(",");
            datas.add(new Data2(temp[0], Integer.parseInt(temp[1]), LocalDate.parse(temp[2])));
        }
    }
}
