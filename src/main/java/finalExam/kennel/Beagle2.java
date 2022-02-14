package finalExam.kennel;

public class Beagle2 extends Dog2 {

    public Beagle2(String name) {
        super(name);
    }

    @Override
    void feed() {
        increaseHappiness(2);
    }

    @Override
    void play(int hours) {
        increaseHappiness(hours * 2);
    }
}
