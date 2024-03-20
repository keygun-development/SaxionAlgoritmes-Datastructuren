# Sort words
## Difficulty: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) 

Write a program that reads words one by one from the terminal until an empty string is read. Then print a line with these words in sorted order. For example:

    Enter word: strike
    Enter word: while
    Enter word: the
    Enter word: iron
    Enter word: is
    Enter word: hot
    Enter word:
    Sorted:
    hot iron is strike the while

### TODO
Implement the method `run()` in the class `Sorter` that solves the above problem. You must use the `IADDoublyLinkedList` from the first exercise to store the words.

### Hints
* For convenience, we added a method `reset()` to the `IADDoublyLinkedList` that (re-)sets the cursor to the first node of the list. We also included a method `insert()` that inserts a new node _before_ the cursor.
* Comparing `Strings` can be done by using the `String` method `int compareTo(String other)`. This method has the following properties:
  * `str1.compareTo(str2)` returns a negative number if str1 < str2 (in alphabetical order, str1 comes before str2)
  * `str1.compareTo(str2)` returns a positive number if str1 > str2
  * `str1.compareTo(str2)` returns 0 if str1 is equal to str2
    * example: `"abc".compareTo("def")` returns a negative number;
    * example: `"def".compareTo("abc")` returns a positive number;



<br/>
<br/>


