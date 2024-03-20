package nl.saxion.iad.linkedlist;

public class IADLinkedListRemoveMain {

    public void run(){
        testRemoveFirst();
        testRemoveLast();
        testRemoveAtIndex();
    }

    public void testRemoveFirst(){
        System.out.println("========================");
        System.out.println("Remove First test");
        IADLinkedList list = new IADLinkedList();
        for (String item: new String[] {"A", "B", "C", "D"}) {
            list.addLast(item);
        }
        list.removeFirst();
        list.removeFirst();
        System.out.println("Expected: [C, D]");
        System.out.print("Actual  : ");
        printList(list);

        list.removeFirst();
        list.removeFirst();
        System.out.println("Expected: []");
        System.out.print("Actual  : ");
        printList(list);
    }

    public void testRemoveLast(){
        System.out.println("========================");
        System.out.println("Remove Last test");
        IADLinkedList list = new IADLinkedList();
        for (String item: new String[] {"A", "B", "C", "D"}) {
            list.addLast(item);
        }
        list.removeLast();
        list.removeLast();
        System.out.println("Expected: [A, B]");
        System.out.print("Actual  : ");
        printList(list);

        list.removeLast();
        list.removeLast();
        System.out.println("Expected: []");
        System.out.print("Actual  : ");
        printList(list);
    }

    public void testRemoveAtIndex(){
        System.out.println("========================");
        System.out.println("Remove At Index test");
        IADLinkedList list = new IADLinkedList();
        for (String item: new String[] {"A", "B", "C", "D"}) {
            list.addLast(item);
        }
        list.remove(1);
        System.out.println("Expected: [A, C, D]");
        System.out.print("Actual  : ");
        printList(list);

        list.remove(2);
        System.out.println("Expected: [A, C]");
        System.out.print("Actual  : ");
        printList(list);

        list.remove(0);
        list.remove(0);
        System.out.println("Expected: []");
        System.out.print("Actual  : ");
        printList(list);
    }


    public void printList(IADLinkedList list){
        System.out.print("[");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        if (list.size() > 0){
            System.out.print(list.getLast());
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        new IADLinkedListRemoveMain().run();
    }
}
