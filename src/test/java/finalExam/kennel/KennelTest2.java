package finalExam.kennel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KennelTest2 {

    Kennel2 kennel = new Kennel2();

    @BeforeEach
    void init() {
        Beagle2 beagle = new Beagle2("Bigli");
        kennel.addDog(beagle);
        Husky2 husky = new Husky2("Morzsi");
        kennel.addDog(husky);
        Husky2 husky2 = new Husky2("Zokni");
        kennel.addDog(husky2);
    }

    @Test
    void testAddDog() {
        List<Dog2> dogs = kennel.getDogs();
        assertEquals(3, dogs.size());
        assertEquals("Morzsi", dogs.get(1).getName());
    }

    @Test
    void testFeedAll() {
        kennel.feedAll();
        assertEquals(2, kennel.getDogs().get(0).getHappiness());
        assertEquals(4, kennel.getDogs().get(1).getHappiness());
    }

    @Test
    void testFindByName() {
        Dog2 dog = kennel.findByName("Morzsi");
        assertTrue(dog instanceof Husky2);
        assertEquals("Morzsi", dog.getName());
    }

    @Test
    void testNotFound() {
        assertThrows(IllegalArgumentException.class,
                () -> kennel.findByName("Korom"));
    }

    @Test
    void testPlayWith() {
        kennel.playWith("Morzsi", 4);
        assertEquals(12, kennel.findByName("Morzsi").getHappiness());
    }

    @Test
    void testHappyDogNames() {
        kennel.playWith("Morzsi", 4);
        kennel.playWith("Bigli", 4);
        kennel.playWith("Zokni", 2);

        assertEquals(List.of("Bigli", "Morzsi"), kennel.getHappyDogNames(7));
    }

}
