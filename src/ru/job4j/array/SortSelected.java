package ru.job4j.array;

/**
 * class SortSelected sorting the array in ascending order.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class SortSelected {

    /**
     * method sort sorting the array in ascending order.
     * @param data - array of int.
     * @return - sorted array.
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
