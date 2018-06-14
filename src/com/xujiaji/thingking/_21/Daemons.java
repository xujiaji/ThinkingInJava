package com.xujiaji.thingking._21;

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.*;

class Daemon implements Runnable
{
    private Thread[] t = new Thread[10];
    @Override
    public void run()
    {
        for (int i = 0; i < t.length; i++)
        {
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            printnb("DaemonSpawn " + i + " started, ");
        }
        for (int i = 0; i < t.length; i++)
        {
            printnb("t[" + i + "].isDaemon() = " + t[i].isDaemon() + ", ");
        }
        while (true)
        {
            Thread.yield();
        }
    }
}

class DaemonSpawn implements Runnable {

    @Override
    public void run()
    {
        while (true) {
            Thread.yield();
        }
    }
}

public class Daemons
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        printnb("d.isDamon() = " + d.isDaemon() + ", ");
        TimeUnit.SECONDS.sleep(1);
    }
}