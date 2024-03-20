package nl.saxion.iad.lists;

public class MyArrayList {

    private String[] elements = new String[5];
    private int nrElements = 0;

    public boolean isEmpty() {
        return elements == null;
    }

    public String get(int index) {
        if (index < 0 || index >= nrElements) {
            return null;
        }
        return elements[index];
    }

    public String remove(int index) {
        if (index < 0 || index > nrElements || elements[index] == null) {
            return "";
        }
        elements[index].equals(null);
        for (int i = index; i < nrElements - 1; i++) {
            elements[i] = elements[i + 1];
        }
        nrElements--;
        return elements[nrElements - 1];
    }


    public boolean insert(int index, String newString) {
        if (index < 0) {
            return false;
        }
        if (index > nrElements) {
            elements[index] = "";
            return false;
        }
        if (nrElements == elements.length) {
            String[] newElements = new String[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        if (elements[index] != null) {
            for (int i = nrElements; i > index; i--) {
                elements[i] = elements[i - 1];
            }
        }
        elements[index] = newString;
        nrElements++;
        return true;
    }

    public int size() {
        return nrElements;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < nrElements - 1; i++) {
            sb.append(elements[i] + ", ");
        }
        if (nrElements > 0) {
            sb.append(elements[nrElements - 1]);
        }
        sb.append("]");
        return sb.toString();
    }

}
