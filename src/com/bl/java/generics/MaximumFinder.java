package com.bl.java.generics;

public class MaximumFinder {

    // Method to find the maximum of three Integer objects
    public static Integer findMaximum(Integer x, Integer y, Integer z)
    {
        Integer max = x; // Assume x is the maximum

        if(y.compareTo(max) > 0)
        {
            max = y; // y is the new maximum
        }
        if(z.compareTo(max) > 0)
        {
            max = z; // z is the new maximum
        }

        return max;

    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Find Maximum Problem using Generics");

        // Test cases
        Integer maxInt = findMaximum(9, 5, 7);

        // Print Result
        System.out.println("Maximum Number is: " + maxInt);

    }
}
