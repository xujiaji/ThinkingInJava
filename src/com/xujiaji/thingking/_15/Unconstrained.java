package com.xujiaji.thingking._15;
class Other{}
class BasicOther extends BasicHolder<Other> {}
public class Unconstrained
{
    BasicOther b = new BasicOther(), b2 = new BasicOther();
//    b.set(new Other())
}
