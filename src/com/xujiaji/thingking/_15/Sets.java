package com.xujiaji.thingking._15;

import java.util.HashSet;
import java.util.Set;

public class Sets
{
    //并集
    public static <T> Set<T> union(Set<T> a, Set<T> b)
    {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    //交集
    public static <T> Set<T> intersection(Set<T> a, Set<T> b)
    {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    //superSet中删除所有subSet的元素
    public static <T> Set<T> difference(Set<T> superSet, Set<T> subSet)
    {
        Set<T> result = new HashSet<>(superSet);
        result.removeAll(subSet);
        return result;
    }

    //交集之外的元素
    public static <T> Set<T> complement(Set<T> a, Set<T> b)
    {
        return difference(union(a, b), intersection(a, b));
    }
}
