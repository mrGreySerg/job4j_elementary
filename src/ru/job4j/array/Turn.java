package ru.job4j.array;

/**
 * class Turn turns the array.
 * @author Kustrin Sergei.
 * @version  1.
 */
public class Turn {

    /**
     * method back turns the array.
     * @param array - array, which we are flipping.
     * @return turned array.
     */
    public int[] back(int[] array) {
        int myValue = array.length - 1;
        int temp = 0;
        for (int index = 0; index <= array.length / 2 - 1; index++) {
            temp = array[myValue];
            array[myValue] = array[index];
            array[index] = temp;
            myValue--;
        }
        return array;
    }
}