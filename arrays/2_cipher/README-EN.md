# Cipher
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg)

Write a program that can decrypt code text. You do this by shifting each letter 3 places to the left in the alphabet
For example the letter f becomes an c.

full table:<br />
abcdefghijklmnopqrstuvwxyz<br />
xyzabcdefghijklmnopqrstuvw<br />

You can use this cipher to decrypt messages, for example: <br/>
khoor is code for 'hello'

Implement the decipher(char[] input) method.<br/><br/>
**Try to write a algorithm that uses an array to decrypt the following words:**<br/>
vriwzduh <br/>
dojrulwkp <br/>
dqdfkurqlvp <br/>

<br /><br />
Tips:
- Use "someString".toCharArray() to get a array with characters from a String
- To get the index of a character in the alphabet use ('yourCharacter'-'a'), so ('d'-'a') will return 3 because the 'd' is the fourth (starts from 0) letter in the alphabet
