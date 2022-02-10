package exam03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {

    @Test
    void create() {
        Passenger passenger = new Passenger("John Doe", CruiseClass.LUXURY);
        assertEquals("John Doe", passenger.getName());
        assertEquals(CruiseClass.LUXURY, passenger.getCruiseClass());
    }

    @Test
    void create2() {
        Passenger2 passenger = new Passenger2("John Doe", CruiseClass2.LUXURY);
        assertEquals("John Doe", passenger.getName());
        assertEquals(CruiseClass2.LUXURY, passenger.getCruiseClass());
    }
}
