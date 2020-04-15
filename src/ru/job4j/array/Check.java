package ru.job4j.array;

/**
 * class Check checks all elements in the array are true or false.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class Check {

    /**
     * method mono checks all elements in the array are true or false.
     * @param data - array for checking.
     * @return boolean result for checking.
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean firstValue = data[0];
        for (int index = 1; index < data.length; index++) {
            if (data[index] != firstValue) {
                result = false;
                break;
            }
        }
        return result;
    }
}
