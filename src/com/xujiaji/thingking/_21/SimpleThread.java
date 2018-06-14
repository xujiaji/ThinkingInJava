package com.xujiaji.thingking._21;

public class SimpleThread extends Thread
{
    private static int threadCount = 0;
    private int countDown = 5;
    public SimpleThread()
    {
        super(Integer.toString(++threadCount));
        start();
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++)
        {
            new SimpleThread();
        }
    }

    @Override
    public String toString()
    {
        return "#" + getName() + "(" + countDown + "), ";
    }

    @Override
    public void run()
    {
        while (true)
        {
            System.out.print(this);
            if (--countDown == 0)
            {
                return;
            }
        }
    }
}
