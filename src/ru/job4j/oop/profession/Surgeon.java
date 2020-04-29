package ru.job4j.oop.profession;

public class Surgeon extends Doctor {

    private String placeOfWork;

    public Surgeon(String name,
                   String surname,
                   String education,
                   String birthday,
                   String specialization,
                   String placeOfWork) {
        super(name, surname, education, birthday, specialization);
        this.placeOfWork = placeOfWork;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void doOperation(Patient person) {
    }
}
