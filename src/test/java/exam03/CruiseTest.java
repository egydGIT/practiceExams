package exam03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CruiseTest {

    private Boat boat = new Boat("WetDreams", 5);

    private Cruise cruise = new Cruise(boat, LocalDate.of(2021, 1, 1), 100_000);

    private Boat2 boat2 = new Boat2("WetDreams", 5);

    private Cruise2 cruise2 = new Cruise2(boat2, LocalDate.of(2021, 1, 1), 100_000);

    @Test
    void create() {
        assertEquals(boat, cruise.getBoat());
        assertEquals(LocalDate.of(2021, 1, 1), cruise.getSailing());
        assertEquals(100_000, cruise.getBasicPrice());
    }

    @Test
    void create2() {
        assertEquals(boat2, cruise2.getBoat());
        assertEquals(LocalDate.of(2021, 1, 1), cruise2.getSailing());
        assertEquals(100_000, cruise2.getBasicPrice());
    }

    @Test
    void bookPassenger() {
        cruise.bookPassenger(new Passenger("John Doe", CruiseClass.LUXURY));

        assertEquals(1, cruise.getPassengers().size());
        assertEquals("John Doe", cruise.getPassengers().get(0).getName());
    }

    @Test
    void bookPassenger2() {
        cruise2.bookPassenger(new Passenger2("John Doe", CruiseClass2.LUXURY));

        assertEquals(1, cruise2.getPassengers().size());
        assertEquals("John Doe", cruise2.getPassengers().get(0).getName());
    }

    @Test
    void overBooking() {
        for (int i = 0; i < 5; i++) {
            cruise.bookPassenger(new Passenger("John Doe", CruiseClass.LUXURY));
        }
        assertThrows(IllegalArgumentException.class,
                () -> cruise.bookPassenger(new Passenger("John Doe", CruiseClass.LUXURY)));
    }

    @Test
    void getPriceForPassenger() {
        double price = cruise.getPriceForPassenger(new Passenger("John Doe", CruiseClass.LUXURY));
        assertEquals(300_000, price, 0.5);

        price = cruise.getPriceForPassenger(new Passenger("John Doe", CruiseClass.FIRST));
        assertEquals(180_000, price, 0.5);

        price = cruise.getPriceForPassenger(new Passenger("John Doe", CruiseClass.SECOND));
        assertEquals(100_000, price, 0.5);
    }

    @Test
    void getPriceForPassenger2() {
        double price = cruise2.getPriceForPassenger(new Passenger2("John Doe", CruiseClass2.LUXURY));
        assertEquals(300_000, price, 0.5);

        price = cruise2.getPriceForPassenger(new Passenger2("John Doe", CruiseClass2.FIRST));
        assertEquals(180_000, price, 0.5);

        price = cruise2.getPriceForPassenger(new Passenger2("John Doe", CruiseClass2.SECOND));
        assertEquals(100_000, price, 0.5);
    }

    @Test
    void findPassengerByName() {
        cruise.bookPassenger(new Passenger("John Doe", CruiseClass.LUXURY));
        cruise.bookPassenger(new Passenger("Jack Doe", CruiseClass.FIRST));

        Passenger passenger = cruise.findPassengerByName("Jack Doe");
        assertEquals("Jack Doe", passenger.getName());
    }

    @Test
    void findPassengerByName2() {
        cruise2.bookPassenger(new Passenger2("John Doe", CruiseClass2.LUXURY));
        cruise2.bookPassenger(new Passenger2("Jack Doe", CruiseClass2.FIRST));

        Passenger2 passenger = cruise2.findPassengerByName("Jack Doe");
        assertEquals("Jack Doe", passenger.getName());
    }

    @Test
    void getPassengerNamesOrdered() {
        cruise.bookPassenger(new Passenger("Jack Smith", CruiseClass.FIRST));
        cruise.bookPassenger(new Passenger("John Doe", CruiseClass.LUXURY));
        cruise.bookPassenger(new Passenger("Jack Doe", CruiseClass.FIRST));

        List<String> names = cruise.getPassengerNamesOrdered();
        assertEquals(List.of("Jack Doe", "Jack Smith", "John Doe"), names);
    }

    @Test
    void getPassengerNamesOrdered2() {
        cruise2.bookPassenger(new Passenger2("Jack Smith", CruiseClass2.FIRST));
        cruise2.bookPassenger(new Passenger2("John Doe", CruiseClass2.LUXURY));
        cruise2.bookPassenger(new Passenger2("Jack Doe", CruiseClass2.FIRST));

        List<String> names = cruise2.getPassengerNamesOrdered();
        assertEquals(List.of("Jack Doe", "Jack Smith", "John Doe"), names);
    }

    @Test
    void sumAllBookingsCharged() {
        cruise.bookPassenger(new Passenger("Jack Smith", CruiseClass.LUXURY));
        cruise.bookPassenger(new Passenger("John Doe", CruiseClass.FIRST));
        cruise.bookPassenger(new Passenger("Jack Doe", CruiseClass.SECOND));

        double sum = cruise.sumAllBookingsCharged();
        assertEquals(300_000 + 180_000 + 100_000, sum, 0.5);
    }

    @Test
    void sumAllBookingsCharged2() {
        cruise2.bookPassenger(new Passenger2("Jack Smith", CruiseClass2.LUXURY));
        cruise2.bookPassenger(new Passenger2("John Doe", CruiseClass2.FIRST));
        cruise2.bookPassenger(new Passenger2("Jack Doe", CruiseClass2.SECOND));

        double sum = cruise2.sumAllBookingsCharged();
        assertEquals(300_000 + 180_000 + 100_000, sum, 0.5);
    }

    @Test
    void countPassengerByClass() {
        cruise.bookPassenger(new Passenger("Jack Smith", CruiseClass.LUXURY));
        cruise.bookPassenger(new Passenger("John Doe", CruiseClass.LUXURY));
        cruise.bookPassenger(new Passenger("Jack Doe", CruiseClass.FIRST));

        Map<CruiseClass, Integer> result = cruise.countPassengerByClass();
        assertEquals(Map.of(CruiseClass.LUXURY, 2 , CruiseClass.FIRST, 1), result);
    }

    @Test
    void countPassengerByClass2() {
        cruise2.bookPassenger(new Passenger2("Jack Smith", CruiseClass2.LUXURY));
        cruise2.bookPassenger(new Passenger2("John Doe", CruiseClass2.LUXURY));
        cruise2.bookPassenger(new Passenger2("Jack Doe", CruiseClass2.FIRST));

        Map<CruiseClass2, Integer> result = cruise2.countPassengerByClass();
        assertEquals(Map.of(CruiseClass2.LUXURY, 2 , CruiseClass2.FIRST, 1), result);
    }

}
