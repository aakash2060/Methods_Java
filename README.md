# 1. Methods
In this assignment you will implement three methods:
1. one that returns the lowest value in the array
1. one that returns the highest value in the array
1. one that calculates the average of an array of integers of any size

The input array is of type `int[]` and can be of any size, your method should be able to handle any size of the input array.

Boilerplate code:

```java
public class MethodAssignment {
	public static void main(final String[] args) {
        // Change the next line to initialize the array with some values
		int[] inputArray;
        // Change the next lines so that variables are assigned the value returned from a call to the lowest(), highest(), and calculateAverage() methods, respectively.
		int lowestValue;
        int highestValue;
        double resultAverage;
        
        // Print the elements of the input array
		
        System.out.println("The lowest is: " + lowestValue);
        System.out.println("The highest is: " + highestValue);
		System.out.println("The average is: " + resultAverage);
	}
    static int lowest(int[] arrayOfIntegers) {
		// YOUR CODE HERE
        return /* some variable here */;
	}
    static int highest(int[] arrayOfIntegers) {
		// YOUR CODE HERE
        return /* some variable here */;
	}
	static double calculateAverage(int[] arrayOfIntegers) {
		// YOUR CODE HERE
        return /* some variable here */;
	}

}
```

Example runs:

```bash
The input array is: 1, 2, 3
The lowest is: 1
The highest is: 3
The average is: 2.0
```

```bash
The input array is: 1, 2, 3, 4, 5, 3
The lowest is: 1
The highest is: 5
The average is: 3.0
```

```bash
The input array is: 5, 4, 3, 2, 1
The lowest is: 1
The highest is: 5
The average is: 3.0
```

Hints`
1. Printing the elements of the input array is optional, but helps when you test the program
1. Test several different input arrays. You can hard-code it in the program (i.e. you don't need to use a `Scanner` to read input from the user for this assignment)
1. Make sure the resulting average variable that the method returns is of type `double`

## Assignment workflow

1. Accept the assignment when posted on Moodle
1. ***Clone*** the assignment repository (using IntelliJ)
1. Solve the assignment
1. Submit (`commit` and `push`) the assignment
    1. Resubmit if necessary or contact the instructor for questions.
