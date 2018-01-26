package com.xujiaji.thingking._5;

import static net.mindview.util.Print.print;

class Tree
{
    int height;
    Tree()
    {
        print("Planing a seedling");
        height = 0;
    }
    Tree(int initialHeight)
    {
        height = initialHeight;
        print("Creating new Tree that is " + height + " feet tall.");
    }

    void info()
    {
        print("Tree is " + height + " feet tall.");
    }

    void info(String s)
    {
        print(s + "Tree is " + height + " feet tall.");
    }
}

public class Overloading
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++)
        {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}
