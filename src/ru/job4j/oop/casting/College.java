package ru.job4j.oop.casting;

public class College {

    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student sFreshman = freshman;
        Object oFreshman = sFreshman;
    }
}
