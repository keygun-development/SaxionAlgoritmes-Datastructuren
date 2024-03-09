# Roman numbers
## Difficulty: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) 

Craft an algorithm, possibly beginning with pseudocode, to handle the conversion of Arabic numbers to Roman numerals.
Develop another algorithm and implementation for the reverse translation (Roman to Arabic).
Proceed by implementing these translations within the `arabicToRoman` and `romanToArabic` method bodies within the `RomanMain` class.

## Roman numbers rules:
![romanTable.png](../resources/romanTable.png)
* A symbol placed **after** another of equal or greater value **adds** its value.
  * no more than 3 of the same symbols in a row
* A symbol placed **before** one of greater value **subtracts** its value.
  * Allowed “subtractive” notations: IV, IX, XL, XC, CD, CM
* maximum number represented: 3999 (MMMCMXCIX)

### Implement the following 2 methods

* `String arabicToRoman(int arabic)` :<br>
  converts our number system to Roman numerals, following the conversion rules.<br> E.g.:<br>
  `arabicToRoman(2) -> "II"`<br>
  `arabicToRoman(213) -> "CCXIII"`<br><br>
* `int romanToArabic(String roman)` : <br>
  converts our number system to Roman numerals, following the conversion rules.<br> E.g.:<br>
  `romanToArabic("CDX") -> 410`<br>
  `romanToArabic("MDCCXLI") -> 1741`<br>

### Sample output
Running the program in `RomanMain` should yield the following result:

![example_output.png](example_output.png)

Add some test cases that you think are a good addition to the ones present.

<br/>
<br/>
