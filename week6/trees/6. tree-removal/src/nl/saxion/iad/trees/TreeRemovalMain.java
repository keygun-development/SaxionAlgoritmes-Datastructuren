package nl.saxion.iad.trees;

public class TreeRemovalMain {

    public void run() {

        IADTree tree = new IADTree();
        IADNode root = new IADNode("C");
        tree.setRoot(root);

        IADNode a = new IADNode("A");
        IADNode d = new IADNode("D");
        root.setLeft(a);
        root.setRight(d);

        IADNode b = new IADNode("B");
        a.setRight(b);

        IADNode f = new IADNode("F");
        IADNode e = new IADNode("E");

        d.setRight(f);
        f.setLeft(e);

        System.out.println(tree.toDot());

        tree.remove("C");
        System.out.println(tree.toDot());

        tree.remove("F");
        System.out.println(tree.toDot());

    }


    public static void main(String[] args) {
        new TreeRemovalMain().run();
    }
}
