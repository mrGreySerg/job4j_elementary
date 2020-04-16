package ru.job4j.array;

/**
 * class MinDiapason finds the minimum value of the array in the range.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class MinDiapason {

    /**
     * method findMin finds the minimum value of the array in the range.
     * @param array - array of int.
     * @param start - index start position.
     * @param finish - index finish position.
     * @return - int min value of the array in the range.
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start + 1; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
