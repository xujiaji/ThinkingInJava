package com.xujiaji.thingking._14;

public class GenericToyTest
{
    public static void main(String[] args) throws IllegalAccessException, InstantiationException
    {
        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        Object obj = up.newInstance();
    }

}
