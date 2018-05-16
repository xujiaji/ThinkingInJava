package com.xujiaji.thingking._15;

public class ArrayOfGeneric
{
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    public static void main(String[] args)
    {
        gia = new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();
//        gia[1] = new Generic<Double>();
    }
}
