package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNegativeNumber() {
        Fact fact = new Fact();
        fact.calc(-5);
    }

    @Test
    public void whenPositiveNumber() {
        Fact fact = new Fact();
        int result = fact.calc(3);
        int expected = 6;
        assertThat(result, is(expected));
    }
}