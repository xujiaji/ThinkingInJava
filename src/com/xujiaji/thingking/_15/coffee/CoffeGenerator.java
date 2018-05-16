package com.xujiaji.thingking._15.coffee;

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

public class CoffeGenerator implements Generator<Coffee>, Iterable<Coffee>
{
    private static Random rand = new Random(47);
    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
    private int size = 0;

    public CoffeGenerator() {}
    public CoffeGenerator(int sz)
    {
        size = sz;
    }

    public static void main(String[] args)
    {
        CoffeGenerator gen = new CoffeGenerator();
        for (int i = 0; i < 5; i++)
        {
            System.out.println(gen.next());
        }
        for (Coffee c : new CoffeGenerator(5))
        {
            System.out.println(c);
        }
    }

    @Override
    public Iterator<Coffee> iterator()
    {
        return new CoffeeIterator();
    }

    @Override
    public Coffee next()
    {
        try
        {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee>
    {

        int count = size;
        @Override
        public boolean hasNext()
        {
            return count > 0;
        }

        @Override
        public Coffee next()
        {
            count --;
            return CoffeGenerator.this.next();
        }
    }
}
