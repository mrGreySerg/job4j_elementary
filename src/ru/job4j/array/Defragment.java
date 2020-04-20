package ru.job4j.array;

/**
 * class Defragment transfers the filled cells of the array to the beginning and empty cells to the end.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class Defragment {

    /**
     * method compress transfers the filled cells of the array to the beginning and empty cells to the end.
     * @param array - array of type String.
     * @return new defragmented array.
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                int i = index;
                while (i < array.length) {
                    if (array[i] != null) {
                        array[point] = array[i];
                        array[i] = null;
                        break;
                    }
                    i++;
                }
            }
            System.out.println(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        for (int index = 0; index < compressed.length; index++) {
            System.out.println(compressed[index] + " ");
        }
    }
}
