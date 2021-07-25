package finalExam.workhours;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkHoursTest {

    @Test
    void minWork() {
        WorkHours workHours = new WorkHours();
        String result = workHours.minWork("src/test/resources/finalExam/workhours/workhours.txt");
        assertEquals("John Doe: 2021-01-04", result);
    }
}