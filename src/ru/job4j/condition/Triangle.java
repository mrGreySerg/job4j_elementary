package ru.job4j.condition;

import static java.lang.Math.sqrt;

/**
 * Класс описывает треугольник.
 * @author Kustrin Sergei.
 * @version 1.
 */
public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Проверяет возможность существования треугольника через соотношение длин сторон.
     * @param a - длина первой стороны.
     * @param b - длина второй стороны.
     * @param c - длина третьей стороны.
     * @return - результат существует ли такой треугольник.
     */
    public boolean exist(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    /**
     * Рассчитывает полусумму длин сторон треугольника.
     * @param a - длина одной стороны.
     * @param b - длина второй стороны.
     * @param c - длина третьей стороны.
     * @return - результат вычисления полусумму длин сторон.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Рассчитывает площадь треугольника.
     * @return значение площади треугольника или -1 если такого треугольника не может существовать.
     */
    public double area() {
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            double areaTriangle = sqrt(p * (p - a) * (p - b) * (p - c));
            return areaTriangle;
        } else {
            return -1;
        }
    }

}
