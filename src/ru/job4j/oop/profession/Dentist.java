package ru.job4j.oop.profession;

public class Dentist extends Doctor {

    private int numberOfClinic;

    public Dentist(String name,
                   String surname,
                   String education,
                   String birthday,
                   String specialization,
                   int numberOfClinic) {
        super(name, surname, education, birthday, specialization);
        this.numberOfClinic = numberOfClinic;

    }

    public int getNumberOfClinic() {
        return numberOfClinic;
    }

    public void poolOutTooth(Patient person) {
    }

    public void treatTooth(Patient person) {
    }

}
