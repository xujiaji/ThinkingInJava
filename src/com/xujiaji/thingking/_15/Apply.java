package com.xujiaji.thingking._15;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static net.mindview.util.Print.print;

public class Apply
{
    public static <T, S extends Iterable<? extends T>>
    void apply(S seq, Method f, Object ... args)
    {
        try
        {
            for(T t : seq)
            {
                f.invoke(t, args);
            }
        } catch (Exception e)
        {
            throw  new RuntimeException(e);
        }
    }
}

class Shape
{
    public void rotate()
    {
        print(this + "rotate");
    }

    public void resize(int newSize)
    {
        print(this + " resize " + newSize);
    }
}

class Square extends Shape
{
}

class FilledList<T> extends ArrayList<T>
{
    public FilledList(Class<? extends T> type, int size)
    {
        try
        {
            for (int i = 0; i < size; i++)
            {
                add(type.newInstance());
            }
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}

class ApplyTest
{
    public static void main(String[] args) throws Exception
    {
        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            shapes.add(new Shape());
        }
        Apply.apply(shapes, Shape.class.getMethod("rotate"));
        Apply.apply(shapes, Shape.class.getMethod("resize", int.class), 5);

        Apply.apply(new FilledList<>(Square.class, 10), Square.class.getMethod("rotate"));
    }
}