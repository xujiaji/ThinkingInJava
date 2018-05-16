package com.xujiaji.thingking._15;

interface OrdinaryGetter
{
    Base get();
}
interface DerivedGetter extends OrdinaryGetter
{
    Derived get();
}

class Base{}

class Derived extends Base {}

public class CovariantReturnTypes
{
    void test(DerivedGetter d)
    {
        Derived d2 = d.get();
    }
}
