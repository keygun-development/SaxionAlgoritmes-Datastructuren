package nl.saxion.iad.trees;

public class IADTree {

    private IADNode root;


    public void add(String value) {
        // TODO: implement

    }


    public String toDot() {
        String dotStr = "digraph G {";
        if (root != null) {
            dotStr += root.toDot();
        }
        dotStr += "}";
        return dotStr;
    }

}
