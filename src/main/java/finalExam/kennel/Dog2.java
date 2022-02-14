package finalExam.kennel;

public abstract class Dog2 {

    private String name;
    private int happiness;

    public Dog2(String name) {
        this.name = name;
        this.happiness = 0;
    }

    abstract void feed();

    abstract void play(int hours);

    public void increaseHappiness(int number) {
        happiness += number;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }
}
