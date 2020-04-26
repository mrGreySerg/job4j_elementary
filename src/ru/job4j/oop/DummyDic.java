package ru.job4j.oop;

/**
 * Фиктивный словарь.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class DummyDic {

    /**
     * Метод принмает слово и выводит "Неизвестное слово - " + введенное слово.
     * @param eng - любое слово.
     * @return - "Неизвестное слово - " + введенное слово.
     */
    public String engToRus(String eng) {
        return "Неизвестное слово - " + eng;
    }

    /**
     * метод main.
     * @param args - args.
     */
    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();
        String translate = dictionary.engToRus("book");
        System.out.println(translate);
    }
}
