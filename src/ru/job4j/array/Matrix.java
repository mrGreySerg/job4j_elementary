package ru.job4j.array;

/**
 * class Matrix creates the array of the multiplication table.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class Matrix {

    /**
     * method multiple creates the array of the multiplication table.
     * @param size - size of the multiplication table.
     * @return - two-dimensional array of the multiplication table.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
