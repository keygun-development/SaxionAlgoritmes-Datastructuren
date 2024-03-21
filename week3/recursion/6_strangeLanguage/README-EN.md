# Strange language
## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg)
In the Atlantic Sea lies a magical land where creatures communicate in a unique language. They rely on a limited set of characters, and every word they use maintains a consistent length.

As a scientist, you've been tasked with determining how many distinct words these creatures can form.

The infant creatures possess only two letters, 'a' and 'b,' and construct words of three letters. Their possible words include:

aaa, aab, aba, abb,<br>
baa, bab, bba, bbb <br>

This indicates that the infant creatures can only create eight words using these two letters, each word consisting of exactly three letters.

However, the adult creatures are more sophisticated, employing four letters—'a,' 'b,' 'x,' and 'y.' They exclusively use words with a length of five letters.
###TODO: implement the `calculateNumberOfWords`method
`int calculateNumberOfWords(char[] characters, int wordLength)`
Utilizing recursion, determine the count of words available to these adult creatures."

### Tips
- Consider the base scenario and how to reduce the non-base case further
- How would you calculate the answer by hand?
  <br><br><br>
### EXTRA challenge (hard): implement the `printAllWords` method ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)

`void printAllWords(char[] characters, int wordLength)`:<br>
Generates and displays all possible combinations of a specified length using a provided list of characters.
### Tips
- You can convert `char[]` to `String` by using the String constructor:<br>
  `String x = new String(charlist)`
- You will probably want to use loops as well as recursion
