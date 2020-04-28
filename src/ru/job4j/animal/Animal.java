package ru.job4j.animal;

public class Animal {

    private String name;

    public Animal() {
        super();
        System.out.println("class Animal!!!");
    }

    public Animal(String name) {
        super();
        this.name = name;
    }

    public static void main(String[] args) {
        Tiger angry = new Tiger("barsik");
    }
}
