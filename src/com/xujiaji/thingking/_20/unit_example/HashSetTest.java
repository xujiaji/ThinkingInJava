package com.xujiaji.thingking._20.unit_example;

import net.mindview.atunit.Test;
import net.mindview.util.OSExecute;

import java.util.HashSet;

public class HashSetTest
{
    HashSet<String> testObject = new HashSet<>();

    public static void main(String[] args)
    {
        OSExecute.command("java -cp E:\\JavaProjects\\ThinkingInJava\\out\\production\\ThinkingInJava net.mindview.atunit.AtUnit out\\production\\ThinkingInJava\\com\\xujiaji\\thingking\\_20\\unit_example\\HashSetTest");
    }

    @Test void initialization()
    {
        assert testObject.isEmpty();
        System.out.println(testObject.hashCode());
    }

    @Test void _contains()
    {
        testObject.add("one");
        assert testObject.contains("one");
        System.out.println(testObject.hashCode());
    }

    @Test void _remove()
    {
        testObject.add("one");
        testObject.remove("one");
        assert testObject.isEmpty();
        System.out.println(testObject.hashCode());
    }
}
