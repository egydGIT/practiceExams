package finalExamRetake01.cleaning;

public class House implements Cleanable{

    private Type type;
    private String address;
    private int square;

    public static final int PRICE_PER_SQUARE = 80;

    public House(String address, int square) {
        this.type = Type.HOUSE;
        this.address = address;
        this.square = square;
    }

    @Override
    public int clean() {
        return PRICE_PER_SQUARE * square;
    }

    public Type getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public int getSquare() {
        return square;
    }

    public static int getPricePerSquare() {
        return PRICE_PER_SQUARE;
    }
}
