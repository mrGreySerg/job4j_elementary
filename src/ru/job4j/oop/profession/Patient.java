package ru.job4j.oop.profession;

public class Patient {

    private String name;
    private String surname;
    private int numberOfMedicalPolicy;
    private int age;

    public Patient(String name, String surname, int numberOfMedicalPolicy, int age) {
        this.name = name;
        this.surname = surname;
        this.numberOfMedicalPolicy = numberOfMedicalPolicy;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumberOfMedicalPolicy() {
        return numberOfMedicalPolicy;
    }

    public int getAge() {
        return age;
    }

    public boolean canIll() {
        return true;
    }
}
