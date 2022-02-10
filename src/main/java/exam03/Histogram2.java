package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram2 {

    public String createHistogram(BufferedReader reader) {
        StringBuilder sb = new StringBuilder();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                int numberOfStars = Integer.parseInt(line);
                for (int i = 0; i < numberOfStars; i++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file. ", e);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Histogram2 histogram = new Histogram2();
//        try (BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/exam03/histogram.txt"))) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Histogram2.class.getResourceAsStream("histogram.txt")))) {
            System.out.println(histogram.createHistogram(reader));
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file. ", e);
        }

    }
}
