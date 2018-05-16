package com.xujiaji.thingking._15;

import java.util.Arrays;
import java.util.List;

public class GenericReading
{
    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruits = Arrays.asList(new Fruit());

    static <T> T readExact(List<T> list)
    {
        return list.get(0);
    }

    static void f1()
    {
        Apple a = readExact(apples);
        Fruit f = readExact(fruits);
        f = readExact(apples);
    }

    static void f2()
    {
        Reader<Fruit> fruitReader = new Reader<>();
        Fruit f = fruitReader.readExact(fruits);
//        Fruit a = fruitReader.readExact(apples);
    }

    static void f3()
    {
        CovariantReader<Fruit> fruitReader = new CovariantReader<>();
        Fruit f = fruitReader.readCovariant(fruits);
        Fruit a = fruitReader.readCovariant(apples);
    }

    static class Reader<T>
    {
        T readExact(List<T> list)
        {
            return list.get(0);
        }
    }

    static class CovariantReader<T>
    {
        T readCovariant(List<? extends T> list)
        {
            return list.get(0);
        }
    }
}
