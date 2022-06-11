/*Problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/

import java.util.List;
import java.util.stream.*;

public class Main {
            
    public static void main(String[] args) {
        List<Integer> primes = IntStream.rangeClosed(0, 200000)
                                    .filter(x -> isPrime(x))
                                    .boxed()
                                    .collect(Collectors.toList());
        
        System.out.println(primes.get(10000));
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false; 
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}
