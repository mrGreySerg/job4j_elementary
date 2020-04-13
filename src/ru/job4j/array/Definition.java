package ru.job4j.array;

/**
 * Создание массивов.
 * @author Kustrin Sergei.
 * @version 1
 */
public class Definition {

    /**
     * Method main.
     * @param args - args.
     */
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Sergei Kustrin";
        names[2] = "Artur Pirojkov";
        names[3] = "Jon Rembo";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
