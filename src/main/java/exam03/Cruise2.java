package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise2 {

    private Boat2 boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger2> passengers = new ArrayList<>();

    public Cruise2(Boat2 boat, LocalDate sailing, int basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger2 passenger) {
        if (passengers.size() == boat.getMaxPassengers()) {
            throw new IllegalStateException("There is no place to book. ");
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger2 passenger) {
        return getBasicPrice() * passenger.getCruiseClass().getMultipier();
    }

    public Passenger2 findPassengerByName(String name) {
        for(Passenger2 p : passengers) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        throw new IllegalStateException("There is no match. ");
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> names = new ArrayList<>();
        for (Passenger2 p : passengers) {
            names.add(p.getName());
        }
        Collections.sort(names);
        return names;
    }

    public double sumAllBookingsCharged() {
        double sum = 0.0;
        for(Passenger2 p : passengers) {
            sum += getPriceForPassenger(p);
        }
        return sum;
    }

    public Map<CruiseClass2, Integer> countPassengerByClass() {
        Map<CruiseClass2, Integer> result = new HashMap<>();
        for (Passenger2 p : passengers) {
            if(!result.containsKey(p.getCruiseClass())) {
                result.put(p.getCruiseClass(), 1);
            } else {
                result.put(p.getCruiseClass(), result.get(p.getCruiseClass()) + 1);
            }
        }
        return result;
    }

    public Boat2 getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger2> getPassengers() {
        return passengers;
    }
}
