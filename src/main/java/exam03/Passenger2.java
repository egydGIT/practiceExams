package exam03;

public class Passenger2 {

    private String name;
    private CruiseClass2 cruiseClass;

    public Passenger2(String name, CruiseClass2 cruiseClass) {
        this.name = name;
        this.cruiseClass = cruiseClass;
    }

    public String getName() {
        return name;
    }

    public CruiseClass2 getCruiseClass() {
        return cruiseClass;
    }
}
