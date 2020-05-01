package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

/**
 * Магический шар, который отвечает на простые вопросы методом тыка.
 */
public class MagicBall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? Введите"
                + " простой вопрос на который можно ответить да или нет");
        input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0 :
                System.out.println("Да");
                break;
            case 1 :
                System.out.println("Нет");
                break;
            default:
                System.out.println("Может быть");
        }
    }
}
