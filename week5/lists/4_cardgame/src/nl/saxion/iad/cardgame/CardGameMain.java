package nl.saxion.iad.cardgame;

public class CardGameMain {

    public void run() {
        IADLinkedList cards = createDeck();
        // Exercise 1: implement the shuffle method in IADLinkedList

        cards.shuffle();

        System.out.println("Shuffled cards: ");
        System.out.println(cards.toString());
        System.out.println();

        // Exercise 2: deal cards at random to each player
        // show each player's hand




        // Exercise 3: for a number of rounds, each player draws a card. Highest value wins and gets one point
        // If more than one player has the highest value, they all get one point
        // cards must be removed from the players' hands
        // After all rounds have finished, the player with the highest amount of points wins.
        // Show the turns and the winner



    }


    /**
     * Create a deck of cards
     * instead of 1, 11, 12 and 13, use Ace, Jack, Queen and King
     * we don't use card suits
     */
    public IADLinkedList createDeck() {
        IADLinkedList cards = new IADLinkedList();

        // add four cards of each number
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                cards.addLast(i);
            }
        }
        return cards;
    }

    public static void main(String[] args) {
        new CardGameMain().run();
    }

}
