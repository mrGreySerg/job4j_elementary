package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student sergei = new Student();
        sergei.setFullName("Сергей Николаевич Иванов");
        sergei.setNumberGroup(330834);
        sergei.setEntrance(new Date());
        System.out.println(
                "ФИО студента: " + sergei.getFullName() + ";\n"
                + "Номер группы: " + sergei.getNumberGroup() + ";\n"
                + "Дата поступления: " + sergei.getEntrance() + "."
        );
    }
}
