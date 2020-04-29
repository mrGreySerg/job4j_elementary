package ru.job4j.oop.profession;

public class Engineer extends Profession {

    private String category;
    private String specialization;

    public Engineer(String name,
                    String surname,
                    String education,
                    String birthday,
                    String category,
                    String specialization) {
        super(name, surname, education, birthday);
        this.category = education;
        this.specialization = specialization;
    }

    public boolean canCalculate() {
        return true;
    }

    public boolean canBuild() {
        return true;
    }
}
