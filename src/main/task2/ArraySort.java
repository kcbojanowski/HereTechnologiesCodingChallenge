package main.task2;

public class ArraySort {

    /**
     * Sorts the given array of integers in ascending order using the selection sort.
     *
     * @param array - the array of integers to be sorted
     */
    public static void sort(int[] array) {
        // Iterate over array
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            // Iterate over unsorted part
            for (int j = i + 1; j < array.length; j++) {
                // Updating minIndex, if it's smaller than current minimum
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swapping min element with the first element in the unsorted part.
            // (if it is not already in its correct position)
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Creating test array from exercise
        int[] array = new int[]{1, 9, 3, -4, 3, -11, 7};

        //Print original array for comparison
        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Sort given array using ArraySort.sort()
        ArraySort.sort(array);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
