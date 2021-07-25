package finalExam.kennel;

public abstract class Dog {

    private String name;
    private int happiness;

    public Dog(String name) {
        this.name = name;
        this.happiness = 0;
    }

    abstract void feed();

    abstract void play(int hours);

    public int increaseHappiness(int number) {
        return happiness += number;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }
}
