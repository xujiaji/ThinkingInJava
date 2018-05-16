package com.xujiaji.thingking._15;

import java.awt.*;

interface HasColor
{
    Color getColor();
}

interface Weight { int weight(); }

class Colored<T extends HasColor>
{
    T item;
    Colored(T item)
    {
        this.item = item;
    }

    Color color()
    {
        return item.getColor();
    }
}

class Dimension
{
    public int x, y, z;
}

class ColoredDimension<T extends Dimension & HasColor>
{
    T item;
    ColoredDimension(T item)
    {
        this.item = item;
    }

    T getItem()
    {
        return item;
    }

    Color color()
    {
        return item.getColor();
    }

    int getX()
    {
        return item.x;
    }

    int getY()
    {
        return  item.y;
    }

    int getZ()
    {
        return  item.z;
    }
}

class Solid<T extends Dimension & HasColor & Weight>
{
    T item;
    Solid(T item)
    {
        this.item = item;
    }

    T getItem()
    {
        return item;
    }

    Color color()
    {
        return item.getColor();
    }

    int getX()
    {
        return item.x;
    }

    int getY()
    {
        return  item.y;
    }

    int getZ()
    {
        return  item.z;
    }

    int weight()
    {
        return item.weight();
    }
}

class Bounded extends Dimension implements HasColor, Weight
{

    @Override
    public Color getColor()
    {
        return null;
    }

    @Override
    public int weight()
    {
        return 0;
    }
}

public class BasicBounds
{
    public static void main(String[] args)
    {
        Solid<Bounded> solid = new Solid<>(new Bounded());
    }
}
