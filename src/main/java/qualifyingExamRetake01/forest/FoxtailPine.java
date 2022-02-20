package qualifyingExamRetake01.forest;

public class FoxtailPine extends Tree {

    private final String name = "FoxtailPine";

    public FoxtailPine() {
        super();
    }

    public FoxtailPine(int height) {
        super(height);
    }

    @Override
    void irrigate() {
        increaseHeight(1);
    }

    public String getName() {
        return name;
    }
}
