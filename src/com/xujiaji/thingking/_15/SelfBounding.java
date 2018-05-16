package com.xujiaji.thingking._15;

class SelfBouned<T extends SelfBouned<T>>
{
    T element;
    SelfBouned<T> set(T arg)
    {
        element = arg;
        return this;
    }
    T get()
    {
        return element;
    }
}

class A extends SelfBouned<A> {}
class B extends SelfBouned<A> {}
class C extends SelfBouned<C>
{
    C setAndGet(C arg)
    {
        set(arg);
        return get();
    }
}
class D
{

}
class F extends SelfBouned {
}

public class SelfBounding
{
    public static void main(String[] args)
    {
        A a = new A();
        a.set(new A());
        a = a.set(new A()).get();
        a = a.get();
        C c = new C();
        c = c.setAndGet(new C());
    }
}
