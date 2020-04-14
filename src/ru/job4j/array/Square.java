package ru.job4j.array;

/**
 * Class Square creates an array with elements equal to the square of the index.
 * @author Kustrin Sergei.
 * @version 1
 */
public class Square {

    /**
     * Method calculate return an array with elements equal to the square of the index.
     * @param bound - length of array.
     * @return array.
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < rst.length; index++) {
            rst[index] = (int) Math.pow(index, 2);
        }
        return rst;
    }

    /**
     * Method main.
     * @param args - args.
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
