package ru.job4j.ex;

public class Fact {

    public static void main(String[] args) {
        Fact fact = new Fact();
        System.out.println(fact.calc(-1));
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть положительным!!!");
        }
        int result = 1;
        for (int index = 1; index <= n; index++) {
            result *= index;
        }
        return result;
    }
}
