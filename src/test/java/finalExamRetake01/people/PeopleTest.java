package finalExamRetake01.people;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @Test
    void getNumberOfMales() {
        People people = new People();
        int males = people.getNumberOfMales("src/test/resources/finalExamRetake01/people.csv");
        assertEquals(545, males);
    }

}