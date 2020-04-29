package ru.job4j.oop.profession;

public class Builder extends Engineer {

    private String typeOfBuild;
    private String placeOfBuild;
    private String material;

    public Builder(String name,
                   String surname,
                   String education,
                   String birthday,
                   String category,
                   String specialization,
                   String typeOfBuild,
                   String placeOfBuild,
                   String material) {
        super(name, surname, education, birthday, category, specialization);
        this.typeOfBuild = typeOfBuild;
        this.placeOfBuild = placeOfBuild;
        this.material = material;
    }

    public String getTypeOfBuild() {
        return typeOfBuild;
    }

    public String getPlaceOfBuild() {
        return placeOfBuild;
    }

    public String getMaterial() {
        return material;
    }

    public void buildFromWood() {
    }

    public void buildFromMetal() {
    }

    public void buildFromConcrete() {
    }
}
