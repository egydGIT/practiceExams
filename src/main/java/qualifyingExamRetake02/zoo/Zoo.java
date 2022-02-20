package qualifyingExamRetake02.zoo;

import finalExam.workhours.Data;

import javax.sql.DataSource;
import java.text.Collator;
import java.util.*;

public class Zoo {

    private Set<ZooAnimal> animals = new HashSet<>();

    public Zoo() {
    }

//    public Zoo(DataSource dataSource) {
//
//    }

    public Set<ZooAnimal> getAnimals() {
        return animals;
    }

    public void addAnimal(ZooAnimal animal) {
        animals.add(animal);
    }

    public ZooAnimal getHeaviestAnimalInTheZoo() {
        long max = 0;
        ZooAnimal found = null;
        for (ZooAnimal animal : animals) {
            if (animal.getWeight() > max) {
                max = animal.getWeight();
                found = animal;
            }
        }
        return found;
    }

    public int countWeights() {
        int counter = 0;
        for (ZooAnimal animal : animals) {
            counter += animal.getWeight();
        }
        return counter;
    }

    public ZooAnimal findExactAnimal(ZooAnimal animal) {
        for (ZooAnimal actual : animals) {
            if (actual.equals(animal)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("There is no such animal in the zoo!");
    }

    public ZooAnimal findExactAnimalByName(String name) {
        for (ZooAnimal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        throw new IllegalArgumentException("There is no such animal in the zoo!");
    }

    public int getNumberOfAnimals() {
        int counter = 0;
        for (ZooAnimal animal : animals) {
            counter++;
        }
        return counter;
    }

    public List<ZooAnimal> getAnimalsOrderedByName() {
        List<ZooAnimal> orderedByName = new ArrayList<>(animals);
        Collections.sort(orderedByName);
        return orderedByName;
    }

    public Map<AnimalType, Integer> getAnimalStatistics() {
        Map<AnimalType, Integer> statistic = new HashMap<>();
        for (AnimalType type : AnimalType.values()) {
            statistic.put(type, 0);
        }
        for (ZooAnimal animal : animals) {
            AnimalType actualType = animal.getType();
            if (!statistic.containsKey(actualType)) {
                statistic.put(actualType, 1);
            } else {
                int actualValue = statistic.get(actualType);
                statistic.put(actualType, actualValue + 1);
            }
        }
        return statistic;
    }

    private void checkAnimals() {
        if (animals == null || animals.size() == 0) {
            throw new IllegalArgumentException("Animal list is empty. ");
        }
    }
}
