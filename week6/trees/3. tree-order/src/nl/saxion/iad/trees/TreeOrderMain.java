package nl.saxion.iad.trees;

public class TreeOrderMain {

    public void run() {

        IADTree tree = new IADTree();
        IADNode root = new IADNode("1");
        tree.setRoot(root);

        IADNode two = new IADNode("2");
        IADNode three = new IADNode("3");
        root.setLeft(two);
        root.setRight(three);

        IADNode four = new IADNode("4");
        two.setLeft(four);
        IADNode five = new IADNode("5");
        two.setRight(five);

        IADNode six = new IADNode("6");
        three.setLeft(six);

        System.out.println(root.toDot());

        System.out.print("Pre Order: ");
        System.out.println(tree.preOrder());

        System.out.print("In Order: ");
        System.out.println(tree.inOrder());

    }


    public static void main(String[] args) {
        new TreeOrderMain().run();
    }
}
