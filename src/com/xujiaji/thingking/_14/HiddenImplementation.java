package com.xujiaji.thingking._14;

import java.lang.reflect.*;

public class HiddenImplementation
{
    public static void main(String[] args) throws Exception
    {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());

        C c = (C) a;
        c.g();

        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }

    static void callHiddenMethod(Object a, String methodName) throws Exception
    {
        Method g = a.getClass().getDeclaredMethod(methodName, null);
        g.setAccessible(true);
        g.invoke(a, null);
    }
}
