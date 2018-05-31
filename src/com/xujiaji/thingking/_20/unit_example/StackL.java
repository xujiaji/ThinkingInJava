package com.xujiaji.thingking._20.unit_example;

import java.util.LinkedList;

public class StackL<T>
{
    private LinkedList<T> list = new LinkedList<>();
    public void push(T t)
    {
        list.addFirst(t);
    }

    public T top()
    {
        return list.getFirst();
    }

    public T pop()
    {
        return list.removeFirst();
    }
}
