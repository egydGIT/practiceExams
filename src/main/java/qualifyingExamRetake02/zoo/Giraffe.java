package qualifyingExamRetake02.zoo;

public class Giraffe extends ZooAnimal{

    private AnimalType type;

    public Giraffe(String name, int length) {
        super(name, length);
        this.type = AnimalType.GIRAFFE;
    }

    @Override
    public AnimalType getType() {
        return type;
    }
}
