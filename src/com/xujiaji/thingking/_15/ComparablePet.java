package com.xujiaji.thingking._15;

public class ComparablePet implements Comparable<ComparablePet>
{
    @Override
    public int compareTo(ComparablePet o)
    {
        return 0;
    }
}

//class Cat extends ComparablePet implements Comparable<Cat>
//{
//    @Override
//    public int compareTo(ComparablePet o)
//    {
//        return 0;
//    }
//}

class Hamster extends ComparablePet implements Comparable<ComparablePet>
{
    @Override
    public int compareTo(ComparablePet o)
    {
        return super.compareTo(o);
    }
}

class Gecko extends ComparablePet {
    @Override
    public int compareTo(ComparablePet o)
    {
        return super.compareTo(o);
    }
}

//class SelfBounded<T extends SelfBounded<T>>
//{
//
//}