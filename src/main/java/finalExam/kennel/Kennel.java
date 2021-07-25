package finalExam.kennel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void feedAll() {
        for(Dog dog : dogs) {
            dog.feed();
        }
    }

    public Dog findByName(String name) {
        Dog found = null;
        for(Dog dog : dogs) {
            if(dog.getName().equals(name)) {
                found = dog;
            }
        }
        if(found == null) {
            throw new IllegalArgumentException("Can not find dog wit tis name: " + name);
        }
        return found;
    }

    public void playWith(String name, int hours) {
        Dog dog = findByName(name);
        dog.play(hours);
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> names = new ArrayList<>();
        for (Dog dog : dogs) {
            if(dog.getHappiness() > minHappiness) {
                names.add(dog.getName());
            }
        }
        Collections.sort(names);
        return names;
    }

    public List<Dog> getDogs() {
        return dogs;
    }



}
