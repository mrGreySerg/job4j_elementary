package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, int percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount * percent / 100 + amount;
            amount = amount - salary;
            year++;
        }
        return year;
    }
}
