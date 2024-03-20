package nl.saxion.iad.cardgame;

public class Card {
    private Card next;
    private int value;

    public Card(int value) {
        this.value = value;
    }

    public Card getNext() {
        return next;
    }

    public void setNext(Card next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}