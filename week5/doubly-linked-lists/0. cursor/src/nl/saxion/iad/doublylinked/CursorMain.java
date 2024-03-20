package nl.saxion.iad.doublylinked;

public class CursorMain {

    public void run() {
        IADDoublyLinkedList dll = new IADDoublyLinkedList();
        dll.add("A");
        dll.add("B");
        dll.add("C");
        dll.add("D");

        System.out.println("Test: Adding some values");

        System.out.println("Expected: [A, B, C, D]");
        System.out.print("Actual  : ");
        printList(dll);
        System.out.println("Has Next?");
        System.out.println("Expected: false");
        System.out.println("Actual  : " + dll.hasNext());
        System.out.println();

        System.out.println("Test: Previous");
        String prev = dll.previous();
        System.out.println("Expected: C");
        System.out.print("Actual  : ");
        System.out.println(prev);
        System.out.println("Has Next?");
        System.out.println("Expected: true");
        System.out.println("Actual  : " + dll.hasNext());
        System.out.println();

        System.out.println("Test: Previous 2");
        prev = dll.previous();
        System.out.println("Expected: B");
        System.out.print("Actual  : ");
        System.out.println(prev);

        System.out.println("Expected cursor value: B");
        System.out.print("Actual  : ");
        System.out.println(dll.get());
        System.out.println();

        System.out.println("Test: Add item at cursor");
        dll.add("E");
        System.out.println("Expected: [A, B, E, C, D]");
        System.out.print("Actual  : ");
        printList(dll);
        System.out.println("Expected cursor value: E");
        System.out.print("Actual  : ");
        System.out.println(dll.get());
        System.out.println();


        System.out.println("Test: Remove second item in list");
        dll.previous();
        dll.remove();
        System.out.println("Expected: [A, E, C, D]");
        System.out.print("Actual  : ");
        printList(dll);
        System.out.println("Has Next?");
        System.out.println("Expected: true");
        System.out.println("Actual  : " + dll.hasNext());
        System.out.println("Has Previous? (cursor should point to first element)");
        System.out.println("Expected: false");
        System.out.println("Actual  : " + dll.hasPrevious());
        System.out.println();
    }

    public void printList(IADDoublyLinkedList list) {
        System.out.print("[");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        if (list.size() > 0) {
            System.out.print(list.getLast());
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        new CursorMain().run();
    }
}
