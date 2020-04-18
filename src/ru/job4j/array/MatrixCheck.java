package ru.job4j.array;

/**
 * class MatrixCheck checks all row of array fills by char X;
 * @author Kustrin Sergei.
 * @version 1.
 */
public class MatrixCheck {

    /**
     * method monoHorizontal checks all row of array fills by char X;
     * @param board - two-dimensional array for check.
     * @param row - index of row.
     * @return - boolean result of check.
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board[row].length; index++) {
            if (board[row][index] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}