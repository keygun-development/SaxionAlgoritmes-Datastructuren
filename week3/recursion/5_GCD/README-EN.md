# Greatest Common Divisor (GCD)
## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-filled.svg) ![Outlined](../resources/star-filled.svg)

###Greatest common divisor
The greatest common divisor (GCD) of two integers is the largest positive integer that divides both numbers without leaving a remainder. In other words, it's the greatest number that both numbers can be divided by evenly (without any remainder).

####Euclid's algorithm
Euclid's algorithm is a method for finding the greatest common divisor (GCD) of two numbers. It operates on the principle that the GCD of two numbers does not change if the larger number is replaced by its difference with the smaller number. The algorithm repeatedly replaces the larger number with the difference between the larger and the smaller number until both numbers become equal, at which point the common value is the GCD. This iterative process is highly efficient for calculating the GCD of two integers


###TODO: implement the 'calculateGCD' method
`int calculateGCD(int num1, int num2`:<br>
calculates the greatest common divisor of two given whole positive non-zero numbers<br>
For example:<br>
`calculateGCD(10,15) = 15`<br>
1. Because 15 / 10 gives remainer 5, according to euclid's algorithm the answer is the same as the answer to `calculateGCD(5,10)`
2. Because 10 / 5 gives remainder 0, we are done and the answer is 5.


### Tips
- use Math.abs(x) to calculate the absolute value of x:
```Java
int abs(int a){
    if (a < 0){
        return -1 * a; //turns a positive
    } else {
        return a;
}
```
- the use case: `abs(A-B) = abs(B-A)` so you don't have to worry about the order of A and B

### EXTRA challenge: implement `calculateGCDforArray` ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) /  ![Outlined](../resources/star-filled.svg) ![Outlined](../resources/star-filled.svg)![Outlined](../resources/star-filled.svg) ![Outlined](../resources/star-filled.svg)

- As a extra challenge, change the algorithm to accept an array of integers and find the GCD from all these numbers<Br>
  For example:<br>
  `calculateGCDforArray([456, 4104, 912, 57, 114]) = 57`<br>

Run the `calculateGCDarrayTest()` method call by uncommenting to test your implementation

####hint:
Making use of the `calculateGCD(int num1, int num2` makes this method a lot easier.<br>
Or you could implement a method that does it all, if you feel like suffering...

####Solutions
- Check the `calculateGCDforArraySimplified` for a 2 star difficulty solution, making use of the `calculateGCD` method.<br>
- Check the `calculateGCDforArray` for the hard version without reusing the `calculateGCD` method.<br>
- Bonus: check chatGPT's solution `calculateGCDforArrayGPT` elegantly showcasing recursive strength by solving it in less than 10 lines of code.<br>

