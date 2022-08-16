package io.github.dbc;

public class RecursiveFibonacciSequenceGenerator {
    /**
     * This method returns the nth Fibonacci number.
     *
     * @param number The nth Fibonacci number to return.
     * @return the n th term of the Fibonacci sequence.
     */
    public int calculateFibonacciNumber(int number) {
        if (number <= 1) {
            return number;
        }
        return calculateFibonacciNumber(number - 1) + calculateFibonacciNumber(number - 2);
    }
    }
