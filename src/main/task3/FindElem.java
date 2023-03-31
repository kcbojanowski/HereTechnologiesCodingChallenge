package main.task3;

import main.task2.ArraySort;

public class FindElem {

    /**
     * Checks if the specified element is present in the sorted array of integers using binary search.
     * Binary search is more efficient than linear search, because it has routine log2N, while linear search
     * on average has (N+1)/2.
     *
     * @param element the element to search for
     * @param array   the sorted array of integers
     * @return true if the element is present in the array, false otherwise
     */
    public static boolean exists(int element, int[] array) {
        long startTime = System.nanoTime(); // Start the timer
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == element) {
                long endTime = System.nanoTime(); // End the timer
                System.out.println("Execution time: " + (endTime - startTime) + " ns");
                return true;
            }
            else if (array[middle] < element) {
                // Element is in the right half of the array
                left = middle + 1;

            }
            else {
                // Element is in the left half of the array
                right = middle - 1;
            }
        }

        long endTime = System.nanoTime(); // End the timer
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
        return false;
    }

    public static void main(String[] args) {
        // Creating test array from exercise
        int[] array = new int[]{-3, -2, -1, 0, 1, 2, 2, 3};
        int elem = -1;
        boolean result;

        //Print original array for comparison
        System.out.println("Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Element:");
        System.out.println(elem);

        // Search for elem i array using FindElem.exists()
        result = FindElem.exists(elem, array);
        System.out.println("Result: " + result);


    }
}
