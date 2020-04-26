package ru.job4j.oop;

/**
 * Создает класс Кот.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class Cat {

    private String food;
    private String name;

    /**
     * Печатает имя котика и что он ел.
     */
    public void show() {
        System.out.println("Котик " + this.name + ".");
        System.out.println("Съел " + this.food + ".\n");
    }

    /**
     * назначает значение полю food класса Cat.
     * @param meat - значение для поля food.
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * назначает значение полю name класс Cat.
     * @param nick - значение для поля name.
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    /**
     * метод main.
     * @param args - args.
     */
    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("котлету");
        gav.giveNick("Gav");
        gav.show();
        Cat black = new Cat();
        black.eat("рыбу");
        black.giveNick("Black");
        black.show();
    }
}
