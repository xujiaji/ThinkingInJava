package com.xujiaji.thingking._15;

import java.lang.reflect.Array;

public class GenericArrayWithTypeToken<T>
{
    private T[] array;

    public GenericArrayWithTypeToken(Class<T> type, int sz)
    {
        array = (T[]) Array.newInstance(type, sz);
    }

    public static void main(String[] args)
    {
        GenericArrayWithTypeToken<Integer> gai = new GenericArrayWithTypeToken<>(Integer.class, 10);
        Integer[] ia = gai.rep();
    }

    public void put(int index, T item)
    {
        array[index] = item;
    }

    public T[] rep()
    {
        return array;
    }

    public T get(int index)
    {
        return array[index];
    }
}
