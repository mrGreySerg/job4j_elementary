package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rs1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rs1;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(5, 5, 10, 10);
        System.out.println("result (0,0) to (2,0) is " + result);
        System.out.println("result (5,5) to (10,10) is " + result2);
    }
}