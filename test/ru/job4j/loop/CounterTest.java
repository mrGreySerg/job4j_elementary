package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.converter.Converter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rs1 = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rs1, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneThenZero() {
        int rs1 = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(rs1, is(expected));
    }
}
