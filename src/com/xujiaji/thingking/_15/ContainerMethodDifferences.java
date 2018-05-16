package com.xujiaji.thingking._15;

import java.lang.reflect.Method;
import java.util.*;

public class ContainerMethodDifferences
{
    static Set<String> object = methodSet(Object.class);

    static
    {
        object.add("clone");
    }

    static Set<String> methodSet(Class<?> type)
    {
        Set<String> result = new TreeSet<>();
        for (Method m : type.getMethods())
        {
            result.add(m.getName());
        }
        return result;
    }

    static void interfaces(Class<?> type)
    {
        System.out.print("Interfaces in " + type.getSimpleName() + ":");
        List<String> result = new ArrayList<>();
        for (Class<?> c : type.getInterfaces())
        {
            result.add(c.getSimpleName());
        }
        System.out.println(result);
    }

    static void difference(Class<?> superSet, Class<?> subSet)
    {
        System.out.print(superSet.getSimpleName() + " extends " + subSet.getSimpleName() + ", adds:");
        Set<String> comp = Sets.difference(methodSet(superSet), methodSet(subSet));
        comp.removeAll(object);
        System.out.println(comp);
        interfaces(superSet);
    }

    public static void main(String[] args)
    {
        System.out.println("Collection: " + methodSet(Collection.class));
        interfaces(Collection.class);
        difference(Set.class, Collection.class);
        difference(HashSet.class, Set.class);
        difference(LinkedHashSet.class, HashSet.class);
        difference(TreeSet.class, Set.class);
    }
}
