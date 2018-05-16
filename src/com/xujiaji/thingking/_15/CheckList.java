package com.xujiaji.thingking._15;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheckList
{
    static void oldStyleMethod(List probablyDogs)
    {
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args)
    {
        List<Dog> dogs1 = new ArrayList<>();
        oldStyleMethod(dogs1);
        List<Dog> dogs2 = Collections.checkedList(new ArrayList<>(), Dog.class);
        try
        {
            oldStyleMethod(dogs2);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
