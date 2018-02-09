package com.xujiaji.thingking._5;

public class MethodInit2 {
    int i = f();
    int j = g(i);
    int f() {
        System.out.println("f()");
        return 11; }
    int g(int n) { return n * 10; }

    public MethodInit2()
    {
        System.out.println("MethodInit2");
    }

    public static void main(String[] args)
    {
        new MethodInit2();
    }
}

