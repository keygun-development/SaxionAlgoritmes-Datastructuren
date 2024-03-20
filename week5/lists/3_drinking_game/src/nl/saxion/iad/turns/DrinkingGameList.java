package nl.saxion.iad.turns;

/**
 * Simplified version of MyLinkedList class from Introduction to Java Programming and Data Structures by Daniel Liang.
 * See chapter 24.4
 */
public class DrinkingGameList {
    private Player head;

    private int size = 0; // Number of elements in the list

    public String getNextName() {
        if (head.getNext() != null) {
            head = head.getNext();
            return head.getName();
        }
        return null;
    }

    public int getCurrentPlayerShots() {
        return head.getShots();
    }

    public void incrementCurrentPlayerShots() {
        head.setShots(head.getShots() + 1);
    }

    public void add(String value) {
        // TODO: implement this method
    }

    public void removeCurrentPlayer() {
        if (head.getShots() >= 3) {
            size--;
            head = head.getNext();
        }
    }


    /**
     * Override toString() to return elements in the list
     */
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Player current = head.getNext();
        for (int i = 0; i < size; i++) {
            result.append(current.getName());
            current = current.getNext();
            if (i < size - 1) {
                result.append(", "); // Separate two elements with a comma
            } else {
                result.append("]"); // Insert the closing ] in the string
            }
        }

        return result.toString();
    }

    /**
     * Return the number of elements in this list
     */
    public int size() {
        return size;
    }



}

