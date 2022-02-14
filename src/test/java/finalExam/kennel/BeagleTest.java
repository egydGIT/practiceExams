package finalExam.kennel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeagleTest {

    @Test
    void testCreate() {
        Beagle beagle = new Beagle("Bigli");
        assertEquals("Bigli", beagle.getName());
        assertEquals(0, beagle.getHappiness());
    }

    @Test
    void testCreate2() {
        Beagle2 beagle = new Beagle2("Bigli");
        assertEquals("Bigli", beagle.getName());
        assertEquals(0, beagle.getHappiness());
    }

    @Test
    void testFeed() {
        Beagle beagle = new Beagle("Bigli");
        beagle.feed();
        assertEquals(2, beagle.getHappiness());
    }

    @Test
    void testFeed2() {
        Beagle2 beagle = new Beagle2("Bigli");
        beagle.feed();
        assertEquals(2, beagle.getHappiness());
    }

    @Test
    void testPlay() {
        Beagle beagle = new Beagle("Bigli");
        beagle.play(3);
        assertEquals(6, beagle.getHappiness());
    }

    @Test
    void testPlay2() {
        Beagle2 beagle = new Beagle2("Bigli");
        beagle.play(3);
        assertEquals(6, beagle.getHappiness());
    }

}