package finalExam.kennel;

public class Husky2 extends Dog2 {

    public Husky2(String name) {
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
