package ru.job4j.oop.profession;

public class Programmer extends Engineer {

    private String langOfProg;

    public Programmer(String name,
                      String surname,
                      String education,
                      String birthday,
                      String category,
                      String specialization,
                      String langOfProg) {
        super(name, surname, education, birthday, category, specialization);
        this.langOfProg = langOfProg;
    }

    public String getLangOfProg() {
        return langOfProg;
    }

    public void writeGoodCode() {
    }

    public void writeBadCode() {
    }
}

