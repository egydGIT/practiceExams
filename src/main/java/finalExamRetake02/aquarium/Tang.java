package finalExamRetake02.aquarium;

public class Tang extends Fish{

    public Tang(String name, int weight, String colour) {
        super(name, weight, colour);
        lossMemory();
    }

    @Override
    public void feed() {
        increaseWeight(1);
    }
}
