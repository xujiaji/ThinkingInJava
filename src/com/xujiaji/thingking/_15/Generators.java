package com.xujiaji.thingking._15;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

public class Generators
{
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n)
    {
        for (int i = 0; i < n; i++)
        {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args)
    {
        Collection<Coffee> coffees = fill(new ArrayList<>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffees)
        {
            System.out.println(c);
        }
        Collection<Integer> numbers = fill(new ArrayList<>(), new Fibonacci(), 12);
        for (int i : numbers)
        {
            System.out.print(i + " ");
        }
    }
}
