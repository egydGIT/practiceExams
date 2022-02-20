package qualifyingExamRetake02.zoo;

import java.util.Objects;

public class ZooAnimal implements Comparable<ZooAnimal>{

    private String name;
    private int length;
    private long weight;
    private AnimalType type;

    public ZooAnimal(String name) {
        this(name, 0, 0L);
    }

    public ZooAnimal(String name, int length) {
        this(name, length, 0L);
    }

    public ZooAnimal(String name, long weight) {
        this(name, 0, weight);
    }

    public ZooAnimal(String name, int length, long weight) {
        this.name = name;
        this.length = length;
        this.weight = weight;
    }

    @Override
    public int compareTo(ZooAnimal o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooAnimal animal = (ZooAnimal) o;
        return length == animal.length && weight == animal.weight && Objects.equals(name, animal.name) && type == animal.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, weight, type);
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public long getWeight() {
        return weight;
    }

    public AnimalType getType() {
        return type;
    }
}



/*
    // akkor is működne, ha több attributum azonos tipusú lenne

    public static ZooAnimal withName(String name) {
        return new ZooAnimal(name);
    }

    public static ZooAnimal withNameAndLength(String name, int length) {
        return new ZooAnimal(name, length, 0);
    }

    public static ZooAnimal withNameAndWeight(String name, long weight) {
        return new ZooAnimal(name, 0, weight);
    }

    public static ZooAnimal withEveryData(String name, int length, long weight) {
        return new ZooAnimal(name, length, weight);
    }
 */
