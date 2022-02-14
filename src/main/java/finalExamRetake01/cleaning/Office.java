package finalExamRetake01.cleaning;

public class Office implements Cleanable{

    private Type type;
    private String address;
    private int sqare;
    private int floors;

    public static final int PRICE_PER_SQARE = 100;

    public Office(String address, int sqare, int floors) {
        this.type = Type.OFFICE;
        this.address = address;
        this.sqare = sqare;
        this.floors = floors;
    }

    @Override
    public int clean() {
        return PRICE_PER_SQARE * sqare * floors;
    }

    public Type getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public int getSqare() {
        return sqare;
    }

    public int getFloors() {
        return floors;
    }

    public static int getPricePerSqare() {
        return PRICE_PER_SQARE;
    }
}
