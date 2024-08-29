package com.bl.java.generics;

public class MaximumFinder {

    // Generic method to find the maximum of three comparable objects

    public static <T extends Comparable<T>> T findMaximum(T x, T y, T z)
    {
            T max = x;  // Assume x is the maximum

            if (y.compareTo(max) > 0) {
                max = y;  // y is the new maximum
            }

            if (z.compareTo(max) > 0) {
                max = z;  // z is the new maximum
            }

            return max;
    }


    public static void main(String[] args)
    {
        System.out.println("Welcome to Find Maximum Problem using Generics");

        // Test cases
        Integer maxInt = findMaximum(9, 5, 7);   // Max Integer Number
        float maxFloat = findMaximum(8.2f, 10.5f, 9.4f);  // Max float Number
        String maxString = findMaximum("Apple", "Peach", "Banana");  // Max String

        // Print results
        System.out.println("Maximum Number is: " + maxInt);    // Expected: 9
        System.out.println("Maximum Number is: " + maxFloat);   // Expected: 10.5
        System.out.println("Maximum String is: " + maxString);    // Expected: Peach

    }
}
