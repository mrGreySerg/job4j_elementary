package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rs1 = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rs1 = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rs1 = "До скорой встречи.";
        }
        return rs1;
    }

    public static void main(String[] args) {
        String botAnswer = DummyBot.answer("How are you?");
        System.out.println(botAnswer);
        botAnswer = DummyBot.answer("Привет, Бот.");
        System.out.println(botAnswer);
        botAnswer = DummyBot.answer("Пока.");
        System.out.println(botAnswer);
    }
}
