package finalExam.kennel;

public class Husky extends Dog{

    public Husky(String name) {
        super(name);
    }

    @Override
    void feed() {
        increaseHappiness(4);
    }

    @Override
    void play(int hours) {
        increaseHappiness(hours * 3);
    }
}
