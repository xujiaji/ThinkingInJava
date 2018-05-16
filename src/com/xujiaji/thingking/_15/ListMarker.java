package com.xujiaji.thingking._15;


import java.util.ArrayList;
import java.util.List;

public class ListMarker<T>
{
    public static void main(String[] args)
    {
        ListMarker<String> stringListMarker = new ListMarker<>();
        List<String> stringList = stringListMarker.create();
    }

    List<T> create()
    {
        return new ArrayList<>();
    }
}
