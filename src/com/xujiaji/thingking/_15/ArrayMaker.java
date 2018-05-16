package com.xujiaji.thingking._15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T>
{
    private Class<T> kind;
    public ArrayMaker(Class<T> kind)
    {
        this.kind = kind;
    }

    public static void main(String[] args)
    {
        ArrayMaker<String> stringMaker = new ArrayMaker<>(String.class);
        String[] stringArr = stringMaker.create(9);
        System.out.println(Arrays.toString(stringArr));
    }

    @SuppressWarnings("unckedked")
    T[] create(int size)
    {
        return (T[]) Array.newInstance(kind, size);
    }
}
