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
        int euro = Converter.rubleToEuro(100);
        int dollar = Converter.rubleToDollar(100);
        System.out.println("100 rubles are " + euro + " euro.");
        System.out.println("100 rubles are " + dollar + " dollar.");
    }
}