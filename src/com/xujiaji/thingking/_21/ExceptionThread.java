package com.xujiaji.thingking._21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread implements Runnable
{
    public static void main(String[] args)
    {
        try
        {
            ExecutorService exec = Executors.newCachedThreadPool();
            exec.execute(new ExceptionThread());
        } catch (Exception e)
        {
            System.out.println("exception has been handled");
        }

    }

    @Override
    public void run()
    {
        throw new RuntimeException();
    }
}
