package qualifyingExamRetake02.zoo;

public class Lion extends ZooAnimal{

    private AnimalType type;

    public Lion(String name) {
        super(name);
        this.type = AnimalType.LION;
    }

    @Override
    public AnimalType getType() {       // ősben lévő abstact met. implementálása
        return type;
    }
}
