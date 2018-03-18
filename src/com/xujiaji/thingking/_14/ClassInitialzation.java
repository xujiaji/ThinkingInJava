package com.xujiaji.thingking._14;

import java.util.Random;

class Initable
{
    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitialzation.rand.nextInt(1000);
    static
    {
        System.out.println("Initialzing Initable");
    }
}

class Initable2
{
    static int staticNonFinal = 147;
    static
    {
        System.out.println("Initailzing Initable2");
    }
}

class Initable3
{
    static int staticNonFinal = 74;
    static
    {
        System.out.println("Initialzing Initable3");
    }
}

public class ClassInitialzation
{
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException
    {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);

        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("com.xujiaji.thingking._14.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
