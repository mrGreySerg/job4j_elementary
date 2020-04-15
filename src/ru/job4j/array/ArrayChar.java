package ru.job4j.array;

/**
 *class ArrayChar compares elements in arrays.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class ArrayChar {

    /**
     * method startWith compares elements in two arrays.
     * @param word - fist array.
     * @param pref - second array.
     * @return boolean result.
     */
    public static boolean startWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
