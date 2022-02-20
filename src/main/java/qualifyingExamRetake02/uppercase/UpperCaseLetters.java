package qualifyingExamRetake02.uppercase;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class UpperCaseLetters {

    public int getNumberOfUpperCase(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                char[] temp = line.toCharArray();
                for (char c : temp) {
                    if (c >= 65  && c <= 90) {                          // utf-8 characters table
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
