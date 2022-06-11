/*Problem 6
The sum of the squares of the first ten natural numbers is,

The square of the sum of the first ten natural numbers is,

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/

import java.util.stream.*;

public class Main {
            
    public static void main(String[] args) {
        int square = IntStream.rangeClosed(0, 100).map(e -> (int) Math.pow(e, 2)).sum();
        
        int sum = IntStream.rangeClosed(0, 100).sum();
        int sumSquared = (int) Math.pow(sum, 2);
        
        System.out.println(sumSquared - square);
    }
}
