package com.xujiaji.thingking._15;

import net.mindview.util.Generator;

public class BasicGeneratorDemo
{
    public static void main(String[] args)
    {
        Generator<CountedObject> gen = BaseGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++)
        {
            System.out.println(gen.next());
        }
    }
}
