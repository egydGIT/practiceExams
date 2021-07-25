package finalExam.kennel;

public class Beagle extends Dog{

    public Beagle(String name) {
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
