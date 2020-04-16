package ru.job4j.array;

/**
 * class Min finds min element in the array of int.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class Min {


    /**
     * method findMin finds min element in the array of int.
     * @param array - array of int.
     * @return - min element of int in the array.
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
