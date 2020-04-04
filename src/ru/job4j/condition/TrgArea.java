package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double halfPrmtr = (a + b + c) / 2;
        double rs1 = Math.sqrt(halfPrmtr * (halfPrmtr - a) * (halfPrmtr - b) * (halfPrmtr - c));
        return rs1;
    }

    public static void main(String[] args) {
        double rs1 = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rs1);
    }
}
