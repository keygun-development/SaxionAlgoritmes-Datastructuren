package nl.saxion.iad.doublylinked;

public class IADDoublyLinkedList {
    private Node first;
    private Node last;
    private int size;

    private Node cursor;


    public void add(String element) {
        if (cursor == null) {
            addFirst(element);
        } else {
            Node newNode = new Node(element);
            newNode.setNext(cursor.getNext());
            cursor.setNext(newNode);
            cursor.getNext().setPrev(newNode);
            newNode.setPrev(cursor);
            cursor = newNode;
            size++;
        }
    }

    public String get() {
        return cursor.getValue();
    }

    public String remove() {
        if (cursor == null) {
            return null;
        }
        String value = cursor.getValue();
        Node next = cursor.getNext();
        Node prev = cursor.getPrev();
        if (next != null) {
            next.setPrev(prev);
        }
        if (prev != null) {
            prev.setNext(next);
        }
        cursor = next;
        size--;
        return value;
    }

    public String next() {
        cursor.setNext(cursor.getNext());

        return cursor.getNext().getValue();
    }

    public String previous() {
        cursor.setPrev(cursor.getPrev());
        return cursor.getPrev().getValue();
    }

    public boolean hasNext() {
        if (cursor == null) {
            return false;
        }
        if (cursor.getNext() != null)
            return true;
        else
            return false;
    }

    public boolean hasPrevious() {
        if (cursor == null) {
            return false;
        }
        if (cursor.getPrev() != null)
            return true;
        else
            return false;
    }


    public void add(int index, String element) {
        if (index <= 0) {
            addFirst(element);
        } else if (index >= size) {
            addLast(element);
        } else { // find location to add new node after; location at index - 1
            Node current = first;
            for (int i = 1; i < index; i++) {
                current = current.getNext();
            }
            Node newNode = new Node(element);
            Node nextNode = current.getNext();
            newNode.setNext(nextNode);
            nextNode.setPrev(newNode);
            current.setNext(newNode);
            newNode.setPrev(current);
            cursor = newNode;
            size++;
        }
    }

    public void addFirst(String element) {
        Node newNode = new Node(element);
        if (!isEmpty()) {
            newNode.setNext(first);
            first.setPrev(newNode);
        }
        first = newNode;
        if (last == null) {
            last = first;
        }
        cursor = first;
        size++;
    }

    public void addLast(String element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
        }
        last = newNode;
        cursor = last;
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

    public String remove(int index) {
        if (isEmpty()) {
            return null;
        }
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
        Node current = previous.getNext();
        Node next = current.getNext();
        String value = current.getValue();
        previous.setNext(next);
        next.setPrev(previous);
        cursor = previous;
        size--;
        return value;
    }

    public String removeFirst() {
        if (isEmpty()) {
            return null;
        }
        String value = first.getValue();
        first = first.getNext();
        if (first == null) {
            last = null;
        } else {
            first.setPrev(null);
        }
        cursor = first;
        size--;
        return value;
    }

    public String removeLast() {
        if (isEmpty()) {
            return null;
        }
        if (size == 1) {
            return removeFirst();
        }
        String value = last.getValue();
        Node prev = last.getPrev();
        prev.setNext(null);
        last = prev;
        cursor = last;
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

