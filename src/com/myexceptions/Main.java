/**
 *  Java program to demonstrate  catching an exception.
 */

package com.myexceptions;

/**
 *  Main class.
 */
public class Main {

    // Java entry point.
    public static void main(String[] args) {

        // Creating a number.
        int number = 5;

        // Creating a numerator.
        int numerator = 25;

        try {
            // Iterating through numbers from 5 to 0 and divide by it a numerator.
            for (int index = number; index >= 0; index--) {

                int result = numerator / index;

                // Printing the result to console.
                System.out.format("Result of %d / %d is %d", numerator, index, result);

                // Next line.
                System.out.println();

            }
        } catch (Exception ex) {

            System.out.println("Some exception has happened and we are in exception block.");

        } finally {

            System.out.println("We are in finally block.");

        }
    }
}