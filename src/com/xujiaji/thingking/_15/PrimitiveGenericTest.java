package com.xujiaji.thingking._15;

import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

class FArray {
    public static <T> T[] fill(T[] a, Generator<T> gen)
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = gen.next();
        }
        return a;
    }
}

public class PrimitiveGenericTest
{
    public static void main(String[] args)
    {
        String[] strings = FArray.fill(new String[7], new RandomGenerator.String(10));
        Integer[] integers = FArray.fill(new Integer[7], new RandomGenerator.Integer(10));

    }
}
