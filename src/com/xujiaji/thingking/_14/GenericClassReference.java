package com.xujiaji.thingking._14;

public class GenericClassReference
{
    public static void main(String[] args)
    {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;

    }
}
