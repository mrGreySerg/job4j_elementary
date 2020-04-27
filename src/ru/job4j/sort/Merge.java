package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (index < result.length) {
            if (i < left.length && left[i] < right[j]) {
                result[index] = left[i];
                index++;
                i++;
            } else {
                result[index] = right[j];
                index++;
                j++;
            }
            if (j == right.length && i < left.length) {
                result[index] = left[i];
                index++;
                i++;
            } else if (i == left.length && j < right.length) {
                result[index] = right[j];
                index++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {2, 4},
                new int[] {1, 3, 5}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

