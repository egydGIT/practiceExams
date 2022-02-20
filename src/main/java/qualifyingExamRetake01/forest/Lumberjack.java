package qualifyingExamRetake01.forest;

public class Lumberjack {

    public boolean canCut(Tree tree) {
//        if (tree.getHeight() > 4) {
//            return true;
//        } else {
//            return false;
//        }
        return tree.getHeight() > 4 ? true : false;
    }
}
