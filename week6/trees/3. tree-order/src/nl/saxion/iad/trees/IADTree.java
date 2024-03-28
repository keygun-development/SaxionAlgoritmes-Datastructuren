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

    public String preOrder() {
        StringBuilder result = new StringBuilder();
        preOrder(root, result);
        return result.toString();
    }

    private void preOrder(IADNode node, StringBuilder result) {
        if (node != null) {
            result.append(node.getValue()).append(", ");

            preOrder(node.getLeft(), result);
            preOrder(node.getRight(), result);
        }
    }

    public String inOrder() {
        StringBuilder result = new StringBuilder();
        inOrder(root, result);
        return result.toString();
    }

    private void inOrder(IADNode node, StringBuilder result) {
        if (node != null) {
            inOrder(node.getLeft(), result);
            result.append(node.getValue()).append(", ");
            inOrder(node.getRight(), result);
        }
    }
}
