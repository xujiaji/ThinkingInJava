package com.xujiaji.thingking._21;

import java.util.concurrent.ThreadFactory;

public class DaemonThreadFactory implements ThreadFactory
{
    @Override
    public Thread newThread(Runnable r)
    {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
