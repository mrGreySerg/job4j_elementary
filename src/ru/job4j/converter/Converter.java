package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rs1 = value / 70;
        return rs1;
    }

    public static int rubleToDollar(int value) {
        int rs1 = value / 60;
        return rs1;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar." + "\n");
        /*Проверка euro*/
        System.out.println("Проведем тестирование!");
        int rubleInFirst = 140;
        int euroExpected = 2;
        int euroOut = euro;
        boolean passedEuro = euroExpected == euroOut;
        System.out.println("140 rubles are 2 euro. Test result: " + passedEuro);
        /*Проверка dollar*/
        int rubleInSecond = 120;
        int dollarExpected = 2;
        int dollarOut = dollar;
        boolean passedDollar = dollarExpected == dollarOut;
        System.out.println("120 rubles are 2 dollars. Test result: " + passedDollar);

    }
}