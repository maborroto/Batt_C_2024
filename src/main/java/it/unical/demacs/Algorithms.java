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

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 2; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Checks if two given strings are Anagrams
     *
     * @param str1
     * @param str2
     * @return a boolean value
     * @throws IllegalArgumentException if one of the strings is null
     */
    public boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : str2.toLowerCase().toCharArray()) {
            charCount[c - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
