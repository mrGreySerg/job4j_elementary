package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap3To0() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expect = new int[] {4, 2, 3, 1};
        int[] result = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSwap1To2() {
        int[] input = new int[] {1, 3, 2, 4};
        int[] expect = new int[] {1, 2, 3, 4};
        int[] result = SwitchArray.swap(input, 2, 1);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSwap0to0() {
        int[] input = new int[] {0, 1};
        int[] expect = new int[] {0, 1};
        int[] result = SwitchArray.swap(input, 0, 0);
        assertThat(result, is(expect));
    }
}