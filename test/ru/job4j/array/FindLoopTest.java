package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas3Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {0, 4, 5, 3, 0};
        int value = 3;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas0ThenFalse() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 1, 1};
        int value = 0;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int expect = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind2() {
        int[] input = new int[] {1, 2, 0, 3, 2};
        int element = 0;
        int start = 2;
        int finish = 3;
        int expect = 2;
        int result = FindLoop.indexOf(input, element, start, finish);
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindFalse() {
        int[] input = {0, 0, 1, 1, 1};
        int element = 1;
        int start = 0;
        int finish = 1;
        int expect = -1;
        int result = FindLoop.indexOf(input, element, start, finish);
        assertThat(result, is(expect));
    }
}