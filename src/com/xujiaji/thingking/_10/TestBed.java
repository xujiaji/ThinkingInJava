package com.xujiaji.thingking._10;

/**
 * Created by jiaji on 2018/3/5.
 */
public class TestBed {
    public void f(){ System.out.println("f()"); }
    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}

