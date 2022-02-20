package qualifyingExamRetake01.forest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Forest {

    private List<Tree> trees;

    public Forest(List<Tree> trees) {
        this.trees = trees;
    }

    public void rain() {
        for (Tree tree : trees) {
            tree.irrigate();
        }
    }

    public void cutTrees(Lumberjack lumberjack) {
        Iterator<Tree> iterator = trees.iterator();
        while (iterator.hasNext()) {
            Tree actual = iterator.next();
            boolean result = lumberjack.canCut(actual);
            if (result) {
                iterator.remove();
            }
        }
    }

    public boolean isEmpty() {
        return trees.isEmpty();
    }

    public List<String> getStatus() {
        List<String> statuses = new ArrayList<>();
        for (Tree tree : trees) {
            statuses.add("There is a " + tree.getHeight() + " tall " + tree.getName() + " in the forest.");
        }
        return statuses;
    }

    public List<Tree> getTrees() {
        return trees;
    }
}
