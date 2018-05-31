package com.xujiaji.thingking._20.unit_example;

import net.mindview.atunit.Test;
import net.mindview.util.OSExecute;

public class AtUnitExample
{
    public static void main(String[] args)
    {
        OSExecute.command("java -cp E:\\JavaProjects\\ThinkingInJava\\out\\production\\ThinkingInJava net.mindview.atunit.AtUnit out\\production\\ThinkingInJava\\com\\xujiaji\\thingking\\_20\\unit_example\\AtUnitExample");
    }

    public String methodOne()
    {
        return "This is methodOne";
    }

    public int methodTwo()
    {
        System.out.println("This is methodTwo");
        return 2;
    }

    @Test boolean methodOneTest()
    {
        return methodOne().equals("This is methodOne");
    }

    @Test boolean m2()
    {
        return methodTwo() == 2;
    }

    @Test boolean m3()
    {
        return true;
    }

    @Test boolean failtrueTest()
    {
        return false;
    }

    @Test boolean anotherDisappointment()
    {
        return false;
    }

}
