package com.xujiaji.thingking._10;

import static net.mindview.util.Print.print;

/**
 * Created by jiaji on 2018/3/3.
 */
abstract class Base
{
    public Base(int i)
    {
        print("Base constructor, i = " + i);
    }
    public abstract void f();
}
public class AnonyousConstructor {
    public static Base getBase(int i)
    {
        return new Base(i) {
            { print("Inside instance initializer"); }
            @Override
            public void f() {
                print("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
