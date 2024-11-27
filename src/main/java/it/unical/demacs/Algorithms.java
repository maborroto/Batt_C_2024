package it.unical.demacs;

public class Algorithms {

    /**
     * Sorts a given non-null array
     *
     * @param array to ber ordered
     * @throws IllegalArgumentException if the input array is null
     */
    public void sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }
}
