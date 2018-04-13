package com.xujiaji.thingking._15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T>
{
    private List<T> storage = new ArrayList<>();
    private Random random = new Random();

    public static void main(String[] args)
    {
        RandomList<String> randomList = new RandomList<>();
        for (String s : "my name is xu jia ji".split(" "))
        {
            randomList.add(s);
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.print(randomList.select() + " ");
        }
    }

    public void add(T item)
    {
        storage.add(item);
    }

    public T select()
    {
        return storage.get(random.nextInt(storage.size()));
    }
}
