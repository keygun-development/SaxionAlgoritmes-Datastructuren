package nl.saxion.iad.trees;


public class FamilyTreeMain {

    public void run() {
        IADTree tree = new IADTree();
        IADNode me = new IADNode("me");
        tree.setRoot(me);

        IADNode dad = new IADNode("dad");
        IADNode mum = new IADNode("mum");
        me.setLeft(dad);
        me.setRight(mum);

        IADNode dadMum = new IADNode("dadmum");
        IADNode dadDad = new IADNode("daddad");
        IADNode mumMum = new IADNode("mummum");
        IADNode mumDad = new IADNode("mumdad");
        dad.setLeft(dadMum);
        dad.setRight(dadDad);
        mum.setLeft(mumMum);
        mum.setRight(mumDad);

        IADNode daddadMum = new IADNode("daddadmum");
        IADNode daddadDad = new IADNode("daddaddad");
        IADNode dadmumDad = new IADNode("dadmumdad");
        IADNode dadmumMum = new IADNode("dadmummum");
        IADNode mummumMum = new IADNode("mummummum");
        IADNode mummumDad = new IADNode("mummumdad");
        IADNode mumdadMum = new IADNode("mumdadmum");
        IADNode mumdadDad = new IADNode("mumdaddad");
        dadDad.setLeft(daddadMum);
        dadDad.setRight(daddadDad);
        dadMum.setLeft(dadmumDad);
        dadMum.setRight(dadmumMum);
        mumMum.setLeft(mummumMum);
        mumMum.setRight(mummumDad);
        mumDad.setLeft(mumdadDad);
        mumDad.setRight(mumdadMum);

        System.out.println(tree.size());

        System.out.println(tree.toDot());
    }

    public static void main(String[] args) {
        new FamilyTreeMain().run();
    }
}
