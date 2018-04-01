package com.xujiaji.thingking._14;

import static net.mindview.util.Print.print;

class C implements A
{

    @Override
    public void f()
    {
        print("public C.f()");
    }

    public void g() {
        print("public C.g()");
    }

    void u() {
        print("package C.r()");
    }

    protected void v() {
        print("protected C.v()");
    }

    private void w() {
        print("private C.w()");
    }
}

public class HiddenC
{
    public static A makeA()
    {
        return new C();
    }
}
