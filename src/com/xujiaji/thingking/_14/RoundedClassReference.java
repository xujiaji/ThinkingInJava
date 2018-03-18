package com.xujiaji.thingking._14;

public class RoundedClassReference
{
    public static void main(String[] args)
    {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
    }
}
