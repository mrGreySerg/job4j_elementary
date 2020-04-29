package ru.job4j.oop.profession;

public class Doctor extends Profession {

    private String specialization;

    public Doctor(String name,
                  String surname,
                  String education,
                  String birthday,
                  String specialization) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public boolean checkIfIll(Patient person) {
        return true;
    }

    public void treat(Patient person) {
    }

    public boolean giveSickLeave(Patient person) {
        return true;
    }
}
