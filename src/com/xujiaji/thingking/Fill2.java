package com.xujiaji.thingking;

import generics.SimpleQueue;
import generics.coffee.Coffee;
import generics.coffee.Latte;
import generics.coffee.Mocha;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static net.mindview.util.Print.print;

interface Addable<T> { void add(T t); }

public class Fill2
{
    public static <T> void fill(Addable<T> addable, Class<? extends T> classToken, int size)
    {
        for (int i = 0; i < size; i++)
        {
            try
            {
                addable.add(classToken.newInstance());
            } catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }
    }

    public static <T> void fill(Addable<T> addable, Generator<T> generator, int size)
    {
        for (int i = 0; i < size; i++)
        {
            addable.add(generator.next());
        }
    }

}


class AddableCollectionAdapter<T> implements Addable<T>
{
    private Collection<T> c;

    public AddableCollectionAdapter(Collection<T> c)
    {
        this.c = c;
    }

    @Override
    public void add(T t)
    {
        c.add(t);
    }
}

class Adapter
{
    public static <T> Addable<T> collectionAdapter(Collection<T> c)
    {
        return new AddableCollectionAdapter<T>(c);
    }
}

class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T>
{
    @Override
    public void add(T t)
    {
        super.add(t);
    }
}

class Fill2Test
{
    public static void main(String[] args)
    {
        List<Coffee> carrier = new ArrayList<>();
        Fill2.fill(new AddableCollectionAdapter<>(carrier), Coffee.class, 3);
        Fill2.fill(Adapter.collectionAdapter(carrier), Latte.class, 2);
        for (Coffee c : carrier)
        {
            print(c);
        }
        print("-------------------------------------");
        AddableSimpleQueue<Coffee> coffeeQueue = new AddableSimpleQueue<>();
        Fill2.fill(coffeeQueue, Mocha.class, 4);
        Fill2.fill(coffeeQueue, Latte.class, 2);
        for (Coffee c : coffeeQueue)
        {
            print(c);
        }

    }
}