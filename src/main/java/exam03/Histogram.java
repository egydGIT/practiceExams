package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Histogram {

    public String createHistogram(BufferedReader reader) throws IOException {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            int number = Integer.parseInt(line);
            stringBuilder.append("*".repeat(number) + "\n");
        }
        return stringBuilder.toString();
    }

    public String createHistogram() {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(Histogram.class.getResourceAsStream("histogram.txt")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                sb.append("*".repeat(number) + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = new Histogram().createHistogram();
        System.out.println(result);
    }
}
