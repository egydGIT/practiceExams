package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger) {
        if (boat.getMaxPassengers() == passengers.size()) {
            throw new IllegalArgumentException("Can not book, because there is no free place.");
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger) {
        return getBasicPrice() * passenger.getCruiseClass().getMultiplier();
    }

    public Passenger findPassengerByName(String name) {
        Passenger passenger = null;
        for(Passenger p : passengers) {
            if(p.getName().equals(name)) {
                passenger = p;
            }
        }
        if (passenger == null) {
            throw new IllegalArgumentException("Can not find passenger: " + name);
        }
        return passenger;
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> names = new ArrayList<>();
        for(Passenger p : passengers) {
            names.add(p.getName());
        }
        Collections.sort(names);
        return names;
    }


    public double sumAllBookingsCharged() {
        double sum = 0.0;
        for(Passenger p : passengers) {
            sum += getPriceForPassenger(p);
        }
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> result = new HashMap<>();
        for(Passenger p : passengers) {
            if(!result.containsKey(p.getCruiseClass())) {
                result.put(p.getCruiseClass(), 1);
            }
            else {
                result.put(p.getCruiseClass(), result.get(p.getCruiseClass()) + 1);
            }
        }
        return result;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

}
