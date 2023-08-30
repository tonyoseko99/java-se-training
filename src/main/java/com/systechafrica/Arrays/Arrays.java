package com.systechafrica.Arrays;

import java.util.logging.Logger;

public class Arrays {

    private static final Logger LOGGER = Logger.getLogger(Arrays.class.getName());

    private void arrayOps() {
        // initialize an array
        int[] arr = { 1, 2, 3, 4, 5 };
        LOGGER.info("The array is " + arr);

        // get the length of an array
        int length = arr.length;
        LOGGER.info("The length of the array is " + length);

        // get the element at a given index
        int elementAt = arr[0];
        LOGGER.info("The element at index 0 is " + elementAt);

        // set the element at a given index
        arr[0] = 10;
        LOGGER.info("The element at index 0 is " + arr[0]);

        // iterate over an array
        for (int i = 0; i < arr.length; i++) {
            LOGGER.info("The element at index " + i + " is " + arr[i]);
        }
    }

    // looping through an array
    private void arrayLoops() {
        int[] passMark = { 50, 50, 50, 50, 50 };
        boolean passed;

        for (int i = 0; i < passMark.length; i++) {
            if (passMark[i] < 50) {
                passed = false;
                break;

            } else {
                passed = true;
            }

            LOGGER.info("Student " + i + " passed: " + passed);
        }

    }

    // multidimensional arrays
    private void multidimensionalArray() {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // get the length of a multidimensional array
        int length = matrix.length;
        LOGGER.info("The length of the multidimensional array is " + length);
    }

    public static void main(String[] args) {
        Arrays app = new Arrays();
        app.arrayOps();
        app.arrayLoops();
        app.multidimensionalArray();
    }

}
