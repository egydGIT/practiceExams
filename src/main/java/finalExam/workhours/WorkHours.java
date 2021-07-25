package finalExam.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkHours {

    private Map<String, List<Data>> datas = new HashMap<>();

    public String minWork(String file) {
        String line;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(file))) {
            while ((line = reader.readLine()) != null ) {
                convertLineToData(line);
            }

            Data workerWithMinHour = getWorkerWithMinHour();

            String returnString = workerWithMinHour.getName() + ": " + workerWithMinHour.getDate();
            return returnString;

        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file.");
        }
    }

    private void convertLineToData(String line) {
        String[] temp = line.split(",");
        Data data = new Data(temp[0], Integer.parseInt(temp[1]), LocalDate.parse(temp[2]));
        if(!datas.containsKey(data.getName())) {
            datas.put(data.getName(), new ArrayList<>());
        }
        datas.get(data.getName()).add(data);
    }

    private Data getWorkerWithMinHour() {
        int minHours = 24;
        Data workerWithMinHour = null;
        for(Map.Entry entry : datas.entrySet()) {
            List<Data> dataList = (List<Data>) entry.getValue();
            for (Data data : dataList) {
                if(data.getWorkHoursPerDay() < minHours) {
                    minHours = data.getWorkHoursPerDay();
                    workerWithMinHour = data;
                }
            }
        }
        return workerWithMinHour;
    }

    public static void main(String[] args) {

        WorkHours workHours = new WorkHours();
        String result = workHours.minWork("src/test/resources/finalExam/workhours/workhours.txt");
        System.out.println(result);

    }
}
