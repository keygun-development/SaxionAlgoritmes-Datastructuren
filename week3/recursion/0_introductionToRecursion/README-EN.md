# Introduction to recursion
## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg)

In this tutorial-exercise we are going to introduce the concept of recursion to do. You are going to do some small exercises.
After all these small exercises you should have a basic understanding of recursion and you should be able to do the other exercises.


##Level1
***
overwrite the run() method and copy the square(int input), dont run it yet.
```
    public void run(){
        int value1 = square(1);
        int value2 = square(2);
        int value3 = square(3);
        SaxionApp.printLine("value1: " +value1);
        SaxionApp.printLine("value2: " +value2);
        SaxionApp.printLine("value3: " +value3);
    }

    private int square(int input){
        return input*input;
    }
```
What is the value of value1, value2 and value3 after running it? Run it to see if you are correct.
<br>**solution**
```java
    value1: 1
        value2: 4
        value3: 9
```
<br><br><br>






How can we use the current square method to calculate the sum of all square numbers? (The sum is the result of adding **all** numbers between 0-N, where N is the starting value)
So for example the square sum of all numbers for the number 4 = (4x4)+(3x3)+(2x2)+(1x1) = 16+9+4+1 = 30?
<br>**solution**
```java
    // there are multiple ways of doings this, you probably have a different solution,
// but please study this solution for a while.
    
    int squareSum0 = 0;
            int squareSum1 = square(1);
            int squareSum2 = square(2) + square(1);
            int squareSum3 = square(3) + square(2) + square(1);
            int squareSum4 = square(4) + square(3) + square(2) + square(1);

            SaxionApp.printLine(squareSum4);


            //OR We could use the stored result

            int squareSum0 = 0;
            int squareSum1 = square(1) + squareSum0;
            int squareSum2 = square(2) + squareSum1;
            int squareSum3 = square(3) + squareSum2;
            int squareSum4 = square(4) + squareSum3;

            SaxionApp.printLine(squareSum4);
```
<br><br><br>




What is the pattern in this solution?
<br>**solution**
```java
    In order to calculate the squareSum of X you can use the result of the previous calculation.
        So the solution for squareSum X = square X + squareSum (X-1)
```
<br><br><br>




What makes the squareSum of 0 special?
<br>**solution**
```
    There is no need to know the previous value, the squareSum of 0 is ALWAYS 0 (0*0 = 0)
```
<br><br><br>

## Level 2
Together we are going to implement a recursive solution for the squareSum(x) method. It should return the sum of all squares from 0-x.
So squareSum(4) = (0x0) + (1x1)+ (2x2)+ (3x3)+ (4x4) = 0+1+4+9+16= 30.

A recursive method is a method that at some point calls itselfs. So the following is a recursive method, but there is something wrong with it:
```java
    private int squareSum(int x){
        squareSum(x);
    }
```

What is wrong with the above recursive method?
<br>**solution**
```java
    When squareSum(x) is called it calls squareSum(x) again, and that method calls squareSum(x) again, etc,etc. This will
result in a endless 'loop'. (Every time a method is called it is added to the stack, at some point Java will crash because the stack is completely filled).
```

How can we fix this problem?
<br>**solution**
```java
    We need to make sure that at some point the method stops. 
        And we need to make sure that if we are not in the stop-case we should get 
        closer to the stop-case the next time we run the method.
```

Overwrite the previous code with this code and try implementing a correct solution
```java
    public void run(){
        SaxionApp.printLine("squareSum: " + squareSum(4) + " expected: " +30);
        }
        
    private int squareSum(int x){
        //TODO: change true to a condition: what is the condition when we need to stop?
        if(true){
            //stop-case
            return 0;
        }

        //if the stop-case is not run, run squareSum(..) again but we need to get closer to the stop-case
        //TODO: Change x in something so at some point we stop the recursion
        return squareSum(x);
    }
```

<br>**solution**
```java
    public void run(){
        SaxionApp.printLine("squareSum: " + squareSum(4) + " expected: " +30);
        }

private int squareSum(int x){
        //TODO: change true to a condition: what is the condition when we need to stop?
        if(x==0){ //solution: if x becomes 0 we are done
        //stop-case
        return 0;
        }

        //calculate the square of the current x
        int square = x * x;

        //if the stop-case is not run, run squareSum(..) again but we need to get closer to the stop-case
        //TODO: Change x in something so at some point we stop the recursion
        return square + squareSum(x-1); //solution: the sumSquare of x is x-1, x-1 is closer to the stop-case (x==0) then x is.
        }
```

A recursive method typically comprises two components: a stop-case, commonly referred to as the base-case, and a recursive segment. This recursive segment invokes the same method again,
but gradually approaches the base-case with each iteration

Study the above solution for a bit then try the next exercise!



## Recap
Questions
1. Which 2 parts does a recursive method always need?
2. What is the main purpose of the base case in a recursive method?
3. What does the recursive part in a recursive method do?
4. Can a method have more than 1 base case? why (not)?
5. Can a method have more than 1 recursive part? why (not)?
6. What happens if the base case is not reached and we remain in the recursion?
7. (advanced) What is the stack and what does a stack overflow mean?
   <br>**solution**
```
    1. The base-case and the recursive part
    2. It makes sure the recursion in the method stops at a certain moment. The recursive part should ALWAYS eventually lead to (one of) the base case(s).
    3. It does another call with this same method, please note that this new call is a NEW instance of this method with its own scope and (primitive) variables.
    4. Yes! As long as the recursion eventually reach one of them
    5. Yes! But make sure that eventually one the base cases are reached.
    6. The program will constantly open a new instance of the method being called. It will keep doing this until your entire computer memory is full and then it will crash. Intellij protects us from this by stopping the program preimptive and tell us we have a stack overflow.
    7. The stack is the place in our memory where the instances of the methods that run are stored. If the allocated memory is full we get a stackOverflow. This could potentially lead to dangerous security risks!
```





