package com.xujiaji.thingking._11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static net.mindview.util.Print.print;

public class SetOperations
{
    public static void main(String[] args)
    {
        Set<String> set1 = new HashSet<>();
        Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
        set1.add("M");
        print("H: " + set1.contains("H"));
        print("N: " + set1.contains("N"));
        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "H I J K L".split(" "));
        print("set1包含set2: " + set1.containsAll(set2));
        set1.remove("H");
        print("set1: " + set1);
        print("set1包含set2: " + set1.containsAll(set2));
        set1.removeAll(set2);
        print("set2从set1中移除： " + set1);
        Collections.addAll(set1, "X Y Z".split(" "));
        print("X Y Z 添加到set1中：" + set1);
    }
}
