package finalExam.kennel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HuskyTest {

    @Test
    void testCreate() {
        Husky husky = new Husky("Morzsi");
        assertEquals("Morzsi", husky.getName());
        assertEquals(0, husky.getHappiness());
    }

    @Test
    void testCreate2() {
        Husky2 husky = new Husky2("Morzsi");
        assertEquals("Morzsi", husky.getName());
        assertEquals(0, husky.getHappiness());
    }

    @Test
    void testFeed() {
        Husky husky = new Husky("Morzsi");
        husky.feed();
        assertEquals(4, husky.getHappiness());
    }

    @Test
    void testFeed2() {
        Husky2 husky = new Husky2("Morzsi");
        husky.feed();
        assertEquals(4, husky.getHappiness());
    }

    @Test
    void testPlay() {
        Husky husky = new Husky("Morzsi");
        husky.play(4);
        assertEquals(12, husky.getHappiness());
    }

    @Test
    void testPlay2() {
        Husky2 husky = new Husky2("Morzsi");
        husky.play(4);
        assertEquals(12, husky.getHappiness());
    }
}
