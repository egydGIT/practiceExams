package finalExamRetake02.aquarium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

    private List<Fish> fishes = new ArrayList<>();

    public void addFish(Fish fish) {
        fishes.add(fish);
    }

    public void feed() {
        for (Fish fish : fishes) {
            fish.feed();
        }
    }

    public void removeFish() {
        Iterator<Fish> iterator = fishes.iterator();
        while (iterator.hasNext()) {
            Fish actual = iterator.next();
            if (actual.getWeight() >= 11) {
                iterator.remove();
            }
        }
    }

    public List<String> getStatus() {
        List<String> statuses = new ArrayList<>();
        for (Fish fish : fishes) {
            statuses.add(fish.status());
        }
        return statuses;
    }
}
