package qualifyingExamRetake01.forest;

public class WhitebarkPine extends Tree {

    private final String name = "WhitebarkPine";

    public WhitebarkPine() {
        super();
    }

    public WhitebarkPine(int height) {
        super(height);
    }

    @Override
    void irrigate() {
        increaseHeight(2);
    }

    public String getName() {
        return name;
    }
}
