package com.xujiaji.thingking._11;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords
{
    public static void main(String[] args)
    {
//        Set<String> words = new TreeSet<>(new TextFile("./src/com/xujiaji/thingking/_11/SetOperations.java", "\\W+"));
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("./src/com/xujiaji/thingking/_11/SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
