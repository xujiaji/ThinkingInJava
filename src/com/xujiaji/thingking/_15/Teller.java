package com.xujiaji.thingking._15;

import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.List;

public class Teller
{
    public static Generator<Teller> generator = new Generator<Teller>()
    {
        @Override
        public Teller next()
        {
            return new Teller();
        }
    };
    private static long counter = 1;
    private final long id = counter ++;

    public static void main(String[] args)
    {
        List<Teller> list = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            list.add(generator.next());
        }
        System.out.println(list);
    }

    @Override
    public String toString()
    {
        return "Teller{" +
                "id=" + id +
                '}';
    }
}
