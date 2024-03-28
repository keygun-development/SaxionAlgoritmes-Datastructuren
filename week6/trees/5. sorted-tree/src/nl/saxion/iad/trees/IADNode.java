package nl.saxion.iad.trees;

import java.util.Random;

public class IADNode {

    private IADNode left;
    private IADNode right;
    private String value;

    public IADNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public IADNode getLeft() {
        return left;
    }

    public void setLeft(IADNode left) {
        this.left = left;
    }

    public IADNode getRight() {
        return right;
    }

    public void setRight(IADNode right) {
        this.right = right;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public String toDot() {
        Random rnd = new Random();
        String dotStr = "";
        if (left != null) {
            dotStr += value + "->" + left.value + " ";
            dotStr += left.toDot();
        } else {
            // random part is necessary to prevent name clash if tree contains multiple fields with same name
            String nullNodeName = "l" + value + rnd.nextInt(1000);
            dotStr += nullNodeName + "[shape=\"point\"] " + value + "->" + nullNodeName + " ";
        }
        if (right != null) {
            dotStr += value + "->" + right.value + " ";
            dotStr += right.toDot();
        } else {
            String nullNodeName = "r" + value + rnd.nextInt(1000);
            dotStr += nullNodeName + "[shape=\"point\"] " + value + "->" + nullNodeName + " ";
        }
        return dotStr;
    }

}
