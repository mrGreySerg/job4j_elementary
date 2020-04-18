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

    /**
     * method monoVertical checks all column of array fills by char X;
     * @param board - two-dimensional array for check.
     * @param column - index of column.
     * @return - boolean result of check.
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * method extractDiagonal creates new array from the diagonal elements of the two-dimensional array.
     * @param board - two-dimensional array.
     * @return - new array.
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            result[index] = board[index][index];
        }
        return result;
    }
}