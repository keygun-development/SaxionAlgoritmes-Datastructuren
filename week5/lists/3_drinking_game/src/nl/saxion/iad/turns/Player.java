package nl.saxion.iad.turns;

public class Player {
    private String name;
    private int shots;

    private Player next;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public Player getNext() {
        return next;
    }

    public void setNext(Player next) {
        this.next = next;
    }
}
