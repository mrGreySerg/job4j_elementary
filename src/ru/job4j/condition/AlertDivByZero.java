package ru.job4j.condition;

public class AlertDivByZero {

    public static void main(String[] args) {
        possibleDiv(0);
        possibleDiv(-5);
        possibleDiv(4);

    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by zero.");
        }
        if (number < 0) {
            System.out.println("This is negative numbers.");
        }
    }
}