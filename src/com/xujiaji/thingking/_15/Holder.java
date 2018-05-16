package com.xujiaji.thingking._15;

public class Holder<T>
{
    private T value;
    public Holder(){}
    public Holder(T val)
    {
        value = val;
    }

    public static void main(String[] args)
    {
        Holder<Apple> Apple = new Holder<>(new Apple());
        Apple d = Apple.get();
        Apple.set(d);
//        Holder<Fruit> Fruit = Apple;
        Holder<? extends Fruit> fruit = Apple;
        Fruit p = fruit.get();
        System.out.println(fruit.equals(d));
    }

    public void set(T val)
    {
        value = val;
    }

    public T get()
    {
        return value;
    }

    @Override
    public boolean equals(Object obj)
    {
        return value.equals(obj);
    }
}
