package qualifyingExamRetake01.forest;

public abstract class Tree {

    private int height;
    private String name;

    public Tree() {
        this.height = 0;
    }

    public Tree(int height) {
        this.height = height;
    }

    abstract void irrigate();

    public void increaseHeight(int increase) {
        height += increase;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}
