package com.xujiaji.thingking._14;

import static net.mindview.util.Print.print;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy
{
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots
{
    FancyToy() {super(1);}
}

public class ToyTest
{
    static void printInfo(Class cc)
    {
        print("Class name: " + cc.getName() +
        " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args)
    {
        Class c = null;
        try
        {
            c = Class.forName("com.xujiaji.thingking._14.FancyToy");
        } catch (ClassNotFoundException e)
        {
            print("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
        {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try
        {
            obj = up.newInstance();
        } catch (InstantiationException e)
        {
            print("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e)
        {
            print("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
