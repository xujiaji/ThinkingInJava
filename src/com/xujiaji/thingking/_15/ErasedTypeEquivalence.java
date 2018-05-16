package com.xujiaji.thingking._15;

import java.util.ArrayList;
import java.util.Arrays;

public class ErasedTypeEquivalence
{
    public static void main(String[] args)
    {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
        System.out.println(Arrays.toString(new ArrayList<String>().getClass().getTypeParameters()));
    }
}
