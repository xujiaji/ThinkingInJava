package com.xujiaji.thingking._15;

class GenericSetter<T>
{
    void set(T arg)
    {
        System.out.println("GenericSetter.set(Base)");
    }
}

class DerivedGS extends GenericSetter<Base>
{
    void set(Derived derived)
    {
        System.out.println("DerivedGS.set(Derived derived)");
    }
}

public class PlainGenericInheritance
{
    public static void main(String[] args)
    {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedGS dgs = new DerivedGS();
        dgs.set(derived);
        dgs.set(base);
    }
}
