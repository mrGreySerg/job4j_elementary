package ru.job4j.array;

/**
 * class FindLoop searches for the index of an element in the array.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class FindLoop {

    /**
     * Method indexOf searches for the index of an element in the array.
     * @param data - array of type int.
     * @param el - element, which index we want to find.
     * @return index of element.
     */
    public int indexOf(int[] data, int el) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }
}