package ru.job4j.array;

/**
 * Заполняем массив типа int данными и выводим их.
 * @author Kustrin Sergei
 * @version 1
 */
public class ArrayLoop {

    /**
     * Method main.
     * @param args - args.
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}
