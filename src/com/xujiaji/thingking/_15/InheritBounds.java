package com.xujiaji.thingking._15;

import java.awt.*;

class HoldItem<T>
{
    T item;
    HoldItem(T item)
    {
        this.item = item;
    }
    T getItem()
    {
        return item;
    }
}

class Colored2<T extends HasColor> extends HoldItem<T>
{

    Colored2(T item)
    {
        super(item);
    }

    Color color()
    {
        return item.getColor();
    }
}

public class InheritBounds
{
}
