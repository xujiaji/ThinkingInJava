package com.xujiaji.thingking._21;

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

public class SimpleDaemons implements Runnable
{
    public static void main(String[] args) throws InterruptedException
    {
        for (int i = 0; i < 10; i++)
        {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        print("All daemon started");
        TimeUnit.MILLISECONDS.sleep(100);
    }

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                TimeUnit.MILLISECONDS.sleep(100);
                print(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e)
        {
            print("sleep() interrupted");
        }

    }
}
