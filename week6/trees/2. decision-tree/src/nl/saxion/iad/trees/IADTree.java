package nl.saxion.iad.trees;

public class IADTree {

    private IADNode root;

    public IADNode getRoot() {
        return root;
    }

    public void setRoot(IADNode root) {
        this.root = root;
    }

    public String toDot(){
        String dotStr = "digraph G {";
        if(root != null){
            dotStr += root.toDot();
        }
        dotStr += "}";
        return dotStr;
    }
}
