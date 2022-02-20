package qualifyingExamRetake02.zoo;

public class Elephant extends ZooAnimal{

    private AnimalType type;

    public Elephant(String name, int length, long weight) {
        super(name, length, weight);
        this.type = AnimalType.ELEPHANT;
    }

    @Override
    public AnimalType getType() {
        return type;
    }
}
