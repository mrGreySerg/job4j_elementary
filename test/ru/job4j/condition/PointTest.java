package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void distanceExpected5() {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(0, 5);
        int expected = 5;
        double out = firstPoint.distance(secondPoint);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceExpected2() {
        Point firstPoint3d = new Point(0, 0, 0);
        Point secondPoint3d = new Point(0, 0, 2);
        double expected = 2;
        double out = firstPoint3d.distance3d(secondPoint3d);
        Assert.assertEquals(expected, out, 0.01);
    }
}