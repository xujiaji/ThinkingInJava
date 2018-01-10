package com.xujiaji.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigPow
{
    public static long digPow(int n, int p)
    {
        String values = String.valueOf(n);
        double sum = 0;
        for (int i = 0; i < values.length(); i++)
        {
            int value = Integer.parseInt(String.valueOf(values.charAt(i)));
            sum += Math.pow(value, p + i);
        }

        double k = sum / n;

        if (k % 1 > 0)
        {
            return -1;
        } else
        {
            return (long) k;
        }
    }

    @Test
    public void Test1() {
        assertEquals(1, DigPow.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, DigPow.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, DigPow.digPow(46288, 3));
    }

}