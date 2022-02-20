package qualifyingExamRetake02.uppercase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

public class UpperCaseLettersTest {

    @Test
    public void testGetNumberOfUpperCase() {
        Assertions.assertEquals(8,
                new UpperCaseLetters().getNumberOfUpperCase(Path.of("src/main/resources/qualifyingExamRetake02/characters.txt")));
    }
}