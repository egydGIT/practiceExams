package qualifyingExamRetake02.zoo;

public class Lion extends ZooAnimal{    // is-a, öröklődés

    private AnimalType type;            // has-a, kompozíció

    public Lion(String name) {
        super(name);                    // super: ősben lévő egyik konstuktor hívása az 1. sorban
        this.type = AnimalType.LION;
    }

    @Override
    public AnimalType getType() {       // ősben lévő abstact met. implementálása
        return type;
    }
}
