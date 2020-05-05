package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void message(int numbMatches) {
        System.out.println("Игра продолжается.");
        System.out.println("Спичек осталось: " + numbMatches);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbMatches = 11;
        System.out.println("Правила игры!!!" + System.lineSeparator()
                + "Всего 11 спичек. Два игрока по очереди  берут от 1 до 3 спичек себе."
                + System.lineSeparator()
                + "Выирывает тот, кто забрал последние спички."
        );
        boolean gameContinue = true;
        boolean isPlayer1 = true;
        while (gameContinue) {
            System.out.println();
            System.out.printf("Ход %s игрока: ", isPlayer1 ? "первого" : "второго");
            int moveGamer = Integer.valueOf(input.nextLine());
            if (numbMatches - moveGamer == 0) {
                System.out.printf("%s игрок победил. Поздравляем!!!", isPlayer1 ? "Первый" : "Второй");
                break;
            } else {
                numbMatches -= moveGamer;
                message(numbMatches);
            }
            isPlayer1 = !isPlayer1;
        }
    }
}
