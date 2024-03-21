# Fibonacci
## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg)

###TODO: Implement the `fibonacci` method
`int fibonacci(int value)`<br>
Calculates the n-th value in the fibonacci sequence.

The row of Fibonacci is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ... <br>

Each number is the combination between the previous 2 numbers, and the first 2 numbers are always 0 and 1.

So for example : <br>
- the first two numbers are given and are: 0 and 1.
- the 3th number is 1, because the previous 2 numbers are 0 and 1 (0+1=1)
- the 4th number is 2, because the previous 2 numbers are 1 and 1 (1+1=2)
- the 5th number is 3, because the previous 2 numbers are 1 and 1 (1+2=3)
- the 6th number is 5, because the previous 2 numbers are 2 and 3 (1+2=3)
  etc

BaseCase 1:     Fibonacci(0) is always 0<br>
BaseCase 2:     Fibonacci(1) is always 1<br>
<br><br>
Fibonacci(n) where n >= 2 is always the previous sequencenumber (n-1) + the sequencenumber before that (n-2).<br><br>
So for example the 7th fibonacci number is 8, <br> to calculate this we add the previous 2 fibanacci numbers together (5th=3 and 6th=5). But in order to know the 6th
number we need to know the 4th and 5th fibonacci number, etc.



<br><br>

###Hint:
Think about how to implement the base cases and the recursive part



### EXTRA

- The Fibonacci method is not very efficient (a lot of calculations need to be done), why is this method so slow?
- Do you have a idea how you could potentially make it more efficient?<br>
  (scroll down for an answer)

<br><br><br><br>
<br><br><br><br>
<br><br><br><br>
<br><br><br><br>
<br><br><br><br>

#### Solution
While we can't improve the efficiency of a single calculation, we can cut down on the repeating nature by using a technique called **memoization**
```
Memoization is a technique used to optimize recursive algorithms by storing the results of expensive function calls and returning the cached result when the same inputs occur again. 
It's primarily employed in problems where the same computation is repeated multiple times.
The general idea:
When a (recursive) function is called with certain inputs, the algorithm first checks if the result for those inputs is already stored in the cache. 
If found, it returns the cached result; if not, it computes the result, stores it in the cache, and then returns it. 
This prevents recalculating the same result multiple times.
```


























