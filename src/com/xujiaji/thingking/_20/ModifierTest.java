package com.xujiaji.thingking._20;

import java.lang.reflect.Modifier;

public class ModifierTest
{
    public static void fun()
    {

    }

    public static void main(String[] args)
    {
        Class<?> cl = ModifierTest.class;
        System.out.println(Modifier.isPublic(cl.getModifiers()));
        System.out.println(Modifier.toString(cl.getModifiers()));
        System.out.println(cl.getModifiers());
    }
}
