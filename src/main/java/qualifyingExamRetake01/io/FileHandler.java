package qualifyingExamRetake01.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    public int sumIgnoreComments(String file) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(file))) {
            String line;
            int number = 0;
            while ((line = reader.readLine()) != null) {
                if (!line.startsWith("//")) {
                    number += Integer.parseInt(line);
                }
            }
            return number;
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file. ");
        }
    }
}
