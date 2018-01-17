package com.xujiaji.thingking._11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger
{
    public static void main(String[] args)
    {
        Random ran = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 1000; i++)
        {
            intset.add(ran.nextInt(30));
        }
        System.out.println(intset);
    }
}
