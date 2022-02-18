package finalExamRetake02.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DaVinciCode {

    public int encode(String file, char searchedChar) {
        if (!List.of('0', '1', 'x').contains(searchedChar)) {
            throw new IllegalArgumentException("Parameter should be 1, 0, or x, but yours: " + searchedChar);
        }
        try (BufferedReader br = Files.newBufferedReader(Path.of(file))) {
            String line;
            int counter = 0;
            while ((line = br.readLine()) != null) {
                char[] result = line.toCharArray();
                for (char c : result) {
                    if (c == searchedChar) {
                        counter++;
                    }
                }
            }
            return counter;
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file. ");
        }
    }

}
