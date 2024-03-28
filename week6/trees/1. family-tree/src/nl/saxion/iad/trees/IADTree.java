package nl.saxion.iad.trees;

public class IADTree {

    private IADNode root;

    public IADNode getRoot() {
        return root;
    }

    public void setRoot(IADNode root) {
        this.root = root;
    }

    public String toDot() {
        String dotStr = "digraph G {";
        if (root != null) {
            dotStr += root.toDot();
        }
        dotStr += "}";
        return dotStr;
    }

    public int size() {
        return size(root);
    }

    public int size(IADNode node) {
        if (node == null) {
            return 0;
        }
        int leftSize = size(node.getLeft());
        int rightSize = size(node.getRight());
        return leftSize + rightSize + 1;
    }
}
