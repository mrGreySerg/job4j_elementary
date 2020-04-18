package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean expect = true;
        assertThat(MatrixCheck.monoHorizontal(input, 1), is(expect));

    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        boolean expect = true;
        assertThat(MatrixCheck.monoVertical(input, 2), is(expect));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] expect = {'X', 'X', 'X'};
        assertThat(MatrixCheck.extractDiagonal(input), is(expect));
    }
}