package com.xujiaji.thingking._15;

import java.util.List;

public class UnboundedWildcards1
{
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;

    static void assign1(List list)
    {
        list1 = list;
        list2 = list;
        list3 = list;
    }
    static void assign2(List<?> list)
    {
        list1 = list;
        list2 = list;
        list3 = list;
    }
}
