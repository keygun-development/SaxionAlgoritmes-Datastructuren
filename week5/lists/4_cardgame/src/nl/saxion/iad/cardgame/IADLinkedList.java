package nl.saxion.iad.cardgame;

public class IADLinkedList {
    private Card first;
    private Card last;
    private int size;

    public void add(int index, int value) {
        if (index <= 0) {
            addFirst(value);
        } else if (index >= size) {
            addLast(value);
        } else { // find location to add new node
            Card current = first;
            for (int i = 1; i < index; i++) {
                current = current.getNext();
            }
            Card newCard = new Card(value);
            newCard.setNext(current.getNext());
            current.setNext(newCard);
            size++;
        }
    }

    public void addFirst(int value) {
        Card newCard = new Card(value);
        newCard.setNext(first);
        first = newCard;
        if (last == null) {
            last = first;
        }
        size++;
    }

    public void addLast(int value) {
        Card newCard = new Card(value);
        if (isEmpty()) {
            first = newCard;
        } else {
            last.setNext(newCard);
        }
        last = newCard;
        size++;
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            return -1;
        }
        Card current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public int getFirst() {
        return get(0);
    }

    public int getLast() {
        return get(size - 1);
    }

    public int indexOf(int element) {
        Card current = first;
        for (int i = 0; i < size; i++) {
            if (current.getValue() == element) {
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

    public void shuffle() {
        // TODO: implement this method
    }




    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Card current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.getValue());
            current = current.getNext();
            if (current != null) {
                result.append(", "); // Separate two elements with a comma
            } else {
                result.append("]"); // Insert the closing ] in the string
            }
        }

        return result.toString();
    }

}

