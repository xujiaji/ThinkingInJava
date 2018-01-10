package com.xujiaji.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class Kata
{
    public static void main(String[] args)
    {
        Kata.NumbersWithDigitInside(20, 0);
    }

    @Test
    public void BasicTests() {
        assertArrayEquals(new long[] { 0, 0, 0 }, Kata.NumbersWithDigitInside(5, 6));
        assertArrayEquals(new long[] { 1, 6, 6 }, Kata.NumbersWithDigitInside(7, 6));
        assertArrayEquals(new long[] { 3, 22, 110 }, Kata.NumbersWithDigitInside(11, 1));
        assertArrayEquals(new long[] { 2, 30, 200 }, Kata.NumbersWithDigitInside(20, 0));
        assertArrayEquals(new long[] { 9, 286, 5955146588160L }, Kata.NumbersWithDigitInside(44, 4));
    }

    public static long[] NumbersWithDigitInside(long x, long d)
    {
        long[] values = {0, 0, 0};
        for (long i = 1; i <= x; i++)
        {
            if (String.valueOf(i).contains(String.valueOf(d)))
            {
                values[0] ++;
                values[1] += i;
                values[2] = values[2] == 0 ? i : values[2] * i;
            }
        }
        return values;
    }

}
