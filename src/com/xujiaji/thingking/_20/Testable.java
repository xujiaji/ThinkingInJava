package com.xujiaji.thingking._20;

import com.xujiaji.thingking._20.unit.Test;

public class Testable
{
    public void execute()
    {
        System.out.println("Executing..");
    }

    @Test
    void testExecute()
    {
        execute();
    }
}
