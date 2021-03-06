package ru.job4j.array;

/**
 * class SwitchArray swaps the first and the last elements of the array.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class SwitchArray {

    /**
     * Method swap swaps two any elements in array.
     * @param array - array type of int, which we want to change.
     * @param source - source index of the array.
     * @param dest - destination index of the array.
     * @return - new array after swapping.
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    /**
     * method swapBorder swaps the first and last elements of the array.
     * @param array - array type of int, in witch we are changing the elements.
     * @return - new array.
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * Method main.
     * @param args - args.
     */
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(nums);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}
