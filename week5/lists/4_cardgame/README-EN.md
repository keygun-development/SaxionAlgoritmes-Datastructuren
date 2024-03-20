# Cardgame
## Difficulty: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)

We are creating a simple card game that involves two players. At the beginning of the game, a full deck of cards is randomly distributed between the two players. Each player then shuffles their cards. For five rounds, each player reveals the top card of their deck. The player with the highest card wins one point. If both players have the same value, both players get a point.

To store the cards, we use adapted versions of the `IADLinkedList` and `Node` classes from previous exercises. We renamed the `Node` class `Card`. A card stores a number instead of a `String`.

The `CardGameMain` class contains a starting point for this exercise. We have already created a method that generates a full deck of cards. Normally, playing cards have values Ace, 2-10, Jack, Queen, and King. However, for simplicity, we will use the numeric values 1-13.

There are several stages to this exercise:
* Stage 1: implement the shuffle method in the `IADLinkedList` class
* Stage 2: Select good datastructures to store the players cards and scores and implement an algorithm to deal the cards to the players randomly
  * Keep in mind, that the simulation might be extended to more than two players
* Stage 3: Simulate the game. Show the cards the players have drawn and also the end score and the winner of the game (or a draw)
  <br><br><br>

### TODO 1: shuffle
Implement the `shuffle` method in the `IADLinkedList` class. Before implementing, first write down your algorithm in pseudo code.

#### Expected output 
(example; the order must be different each time you run the program):
```
Shuffled cards: 
[2, 9, 13, 3, 3, 4, 11, 12, 8, 3, 5, 8, 13, 2, 12, 7, 2, 9, 8, 12, 13, 1, 2, 9, 6, 13, 10, 10, 3, 6, 4, 1, 11, 10, 7, 1, 10, 5, 5, 12, 6, 6, 5, 9, 7, 11, 1, 11, 4, 4, 7, 8]
```

### TODO 2: Dealing Logic
Implement the logic that deals cards and shows the player hands

#### expected output (example):

```
Player 1 hand:
[10, 12, 4, 5, 11, 8, 13, 11, 3, 11, 9, 6, 1, 4, 3, 4, 10, 2, 8, 5, 2, 5, 2, 12, 13, 12]
Player 2 hand:
[1, 12, 7, 9, 7, 13, 1, 4, 6, 8, 1, 9, 9, 6, 11, 13, 2, 3, 5, 10, 6, 8, 7, 10, 3, 7]
```

### TODO 3: Game Logic
Implement the logic that simulates rounds, draws cards, compares them and determines the winner

#### expected output (example):
Example 1:
```
Round 1:	5	6	
Round 2:	11	11	
Round 3:	6	8	
Round 4:	3	6	
Round 5:	4	8	

Scores: 1 - 5
Player 2 wins!
```
Example 2:
```
Round 1:	4	4	
Round 2:	1	11	
Round 3:	13	7	
Round 4:	9	11	
Round 5:	13	8	

Scores: 3 - 3
Draw!
```

### Extra challenge
If you want some extra challenge: refactor the simulation for a higher number of players. Adapt the number of rounds if necessary

#### example output:
Example 1:
```
Round 1:	12	11	9	5	
Round 2:	6	8	6	12	
Round 3:	8	7	13	5	
Round 4:	7	3	3	9	
Round 5:	3	1	1	10	
Round 6:	8	6	5	10	
Round 7:	4	5	9	10	

Scores: 1 - 0 - 1 - 5
Player 4 wins!
```

Example 2:
```
Round 1:	10	8	4	1	
Round 2:	12	10	11	12	
Round 3:	5	1	7	1	
Round 4:	7	9	3	4	
Round 5:	13	6	13	7	
Round 6:	6	3	10	8	

Scores: 3 - 1 - 3 - 1
Player 1 wins!
Player 3 wins!
```