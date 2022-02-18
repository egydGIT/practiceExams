package finalExamRetake02.aquarium;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;
    private boolean memoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String status() {
        // Dory, weight: 9, color: blue, short-term memory loss: true
        return name + ", weight: " + weight + ", color: " + color + ", short term memory loss: " + memoryLoss;
    }

    public void feed() {
        increaseWeight(1);
    }

    public void increaseWeight(int increase) {
        this.weight += increase;
    }

    public void lossMemory() {
        this.memoryLoss = true;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }
}
