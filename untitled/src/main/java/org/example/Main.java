package org.example;

public final class Main {
    private Main() {

    }

    /**
     * Sum of two ints.
     *
     * @param args
     */
    public static void main(final String[] args) {
        // checking 1: sum must be "sum" - here have caught exception on github
        // checking 2: missed some points
        // checking 3: -
        final int a = 5;
        final int b = 10;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
