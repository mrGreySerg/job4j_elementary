package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbMatches = 11;
        System.out.println("Правила игры!!! \n"
                + "Всего 11 спичек. Два игрока по очереди  берут от 1 до 3 спичек себе. \n"
                + "Выирывает тот, кто забрал последние спички."
        );
        while (true) {
            System.out.print("\nХод первого игрока: ");
            int firstGamer = Integer.valueOf(input.nextLine());
            if (numbMatches - firstGamer == 0) {
                System.out.println("Первый игрок победил. Поздравляем!!!");
                break;
            } else {
                numbMatches -= firstGamer;
                System.out.println("Игра продолжается.");
                System.out.println("Спичек осталось: " + numbMatches);
            }
            System.out.print("\nХод второго игрока: ");
            int secondGamer = Integer.valueOf(input.nextLine());
            if (numbMatches - secondGamer == 0) {
                System.out.println("Второй игрок победил. Поздравляем!!!");
                break;
            } else {
                numbMatches -= secondGamer;
                System.out.println("Игра продолжается.");
                System.out.println("Спичек осталось: " + numbMatches);
            }
        }
    }
}
