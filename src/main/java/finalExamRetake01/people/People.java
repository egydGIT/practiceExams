package finalExamRetake01.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class People {

    private List<Man> people = new ArrayList<>();

    public int getNumberOfMales(String path) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(path))) {
            readFile(reader);
            return getCounter();
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file. ", e);
        }
    }

    private int getCounter() {
        int counter = 0;
        for (Man man : people) {
            if (man.getGender() == Gender.MALE) {
                counter++;
            }
        }
        return counter;
    }

    private void readFile(BufferedReader reader) throws IOException {
        String line;
        skipHeader(reader);
        while ((line = reader.readLine()) != null) {
            String[] temp = line.split(",");
            Gender gender = Gender.valueOf(temp[4].toUpperCase());
            people.add(new Man(temp[0], temp[1], temp[2], temp[3], gender, temp[5]));
        }
    }

    private void skipHeader(BufferedReader reader) throws IOException {
        reader.readLine();
    }
}
