package com.xujiaji.thingking._15;

interface GenericGetter<T extends GenericGetter<T>>
{
    T get();
}

interface Getter extends GenericGetter<Getter>
{
}

//class Test implements Getter{
//    @Override
//    public Getter get()
//    {
//        return null;
//    }
//}
public class GenericsAndReturnTypes
{
    static void test(Getter g)
    {
        Getter result = g.get();
        GenericGetter gg = g.get();
    }

    public static void main(String[] args)
    {

    }
}
