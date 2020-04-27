package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(that.x - this.x, 2) + pow(that.y - this.y, 2) + pow(that.z - this.z, 2));
    }

    public static void main(String[] args) {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        double distance = first.distance(second);
        System.out.println(distance);
        Point first3d = new Point(0, 0, 0);
        Point second3d = new Point(0, 0, 5);
        double distance3d = first3d.distance3d(second3d);
        System.out.println(distance3d);
    }
}