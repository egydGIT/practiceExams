package qualifyingExam0.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output){
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("Parameter can not be null. ");
        }
        if (!Files.exists(Path.of(output))) {
            try {
                Files.createFile(Path.of(output));
                try (BufferedWriter writer = Files.newBufferedWriter(Path.of(output))) {
                    for (Map.Entry entry : contacts.entrySet()) {
                        writer.write(entry.getKey() + ": " + entry.getValue());
                        writer.newLine();
                    }
                } catch (IOException e) {
                    throw new IllegalArgumentException("Can not write file. ", e);
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("Can not write directory. ", e);
            }
        }


    }
}
