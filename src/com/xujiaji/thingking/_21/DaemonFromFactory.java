package com.xujiaji.thingking._21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

public class DaemonFromFactory implements Runnable
{
    public static void main(String[] args) throws InterruptedException
    {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < 10; i++)
        {
            exec.execute(new DaemonFromFactory());
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
