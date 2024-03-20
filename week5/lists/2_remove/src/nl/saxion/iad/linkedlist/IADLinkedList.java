package nl.saxion.iad.linkedlist;

public class IADLinkedList {
    private Node first;
    private Node last;
    private int size;

    public void add(int index, String element) {
        if (index <= 0) {
            addFirst(element);
        } else if (index >= size) {
            addLast(element);
        } else { // find location to add new node
            Node current = first;
            for (int i = 1; i < index; i++) {
                current = current.getNext();
            }
            Node newNode = new Node(element);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            size++;
        }
    }

    public void addFirst(String element) {
        Node newNode = new Node(element);
        newNode.setNext(first);
        first = newNode;
        if (last == null) {
            last = first;
        }
        size++;
    }

    public void addLast(String element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
        size++;
    }

    public String get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public String getFirst() {
        return get(0);
    }

    public String getLast() {
        return get(size - 1);
    }

    public String removeFirst() {
        if (isEmpty()) {
            return null;
        }
        String value = first.getValue();
        first = first.getNext();
        size--;
        if (size == 0) {
            last = null;
        }
        return value;
    }

    public String removeLast() {
        if(isEmpty()) {
            return null;
        }
        if (size == 1) {
            String value = first.getValue();
            first = last = null;
            size = 0;
            return value;
        }
        Node current = first;
        for (int i = 0; i < size - 2; i++) {
            current = current.getNext();
        }
        String value = last.getValue();
        last = current;
        last.setNext(null);
        size--;
        return value;
    }

    public String remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }
        Node previous = first;
        for (int i = 1; i < index; i++) {
            previous = previous.getNext();
        }
        String value = previous.getNext().getValue();
        previous.setNext(previous.getNext().getNext());
        size--;
        return value;
    }

    public int indexOf(String element) {
        Node current = first;
        for (int i = 0; i < size; i++) {
            if (current.getValue().equals(element)) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
