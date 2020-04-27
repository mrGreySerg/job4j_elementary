package ru.job4j.converter;

/**
 * Class Converter convert one currency to another.
 * @author Sergei Kustrin.
 * @version 1.
 */
public class Converter {

    /**
     * Method rubleToEuro convert rubles to euros.
     * @param value - amount of rubles.
     * @return result  conversion in euros.
     */
    public static int rubleToEuro(int value) {
        int rs1 = value / 70;
        return rs1;
    }

    /**
     * Method rubleToDollar convert rubles to dollars.
     * @param value - amount of rubles.
     * @return result conversion in dollars.
     */
    public static int rubleToDollar(int value) {
        int rs1 = value / 60;
        return rs1;
    }

    /**
     * Method main.
     * @param args - args.
     */
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