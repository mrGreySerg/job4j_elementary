package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 5), new Point(5, 0));
        double result = triangle.area();
        double expect = 12.5;
        assertThat(result, is(expect));
    }

    @Test
    public void whenDoNotExist() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 10), new Point(0, 5));
        double result = triangle.area();
        double expect = -1;
        assertThat(result, is(expect));
    }
}
