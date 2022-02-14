package finalExam.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel2 {

    private List<Dog2> dogs = new ArrayList<>();

    public void addDog(Dog2 dog) {
        dogs.add(dog);
    }

    public void feedAll() {
        for (Dog2 dog : dogs) {
            dog.feed();
        }
    }

    public Dog2 findByName(String name) {
        for (Dog2 dog : dogs) {
            if (dog.getName().equals(name)) {
                return dog;
            }
        }
        throw new IllegalArgumentException("Can't find this dog. " + name);
    }

    public void playWith(String name, int hours) {
        Dog2 found = findByName(name);
        found.play(hours);
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> happyDogNames = new ArrayList<>();
        for (Dog2 dog : dogs) {
            if (dog.getHappiness() > minHappiness) {
                happyDogNames.add(dog.getName());
            }
        }
        return happyDogNames;
    }

    public List<Dog2> getDogs() {
        return dogs;
    }
}
