package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (index < result.length) {

            while (i < left.length) {
                if (left[i] < right[j]) {
                    result[index] = left[i];
                    index++;
                    i++;
                } else {
                    break;
                }
            }

            while (j < right.length) {
                if (right[j] < left[i]) {
                    result[index] = right[j];
                    index++;
                    j++;
                } else {
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] result = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(result));
    }
}
