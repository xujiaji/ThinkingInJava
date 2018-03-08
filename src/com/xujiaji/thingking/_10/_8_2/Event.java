package com.xujiaji.thingking._10._8_2;

/**
 * Created by jiaji on 2018/3/8.
 */
public abstract class Event
{
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime)
    {
        this.delayTime = delayTime;
        start();
    }

    public void start()
    {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready()
    {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
