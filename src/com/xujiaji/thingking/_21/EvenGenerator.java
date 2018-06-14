package com.xujiaji.thingking._21;

public class EvenGenerator extends IntGenerator
{
    private int currentEvenValue = 0;

    public static void main(String[] args)
    {
        EvenChecker.test(new EvenGenerator());
    }

    @Override
    public synchronized int next()
    {
        ++ currentEvenValue;
        Thread.yield();
        ++ currentEvenValue;
        return currentEvenValue;
    }
}
