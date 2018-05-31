package com.xujiaji.thingking._20.unit_example;

import net.mindview.atunit.Test;
import net.mindview.atunit.TestObjectCreate;
import net.mindview.util.OSExecute;

public class AtUnitExample3
{
    private int n;
    public AtUnitExample3(int n)
    {
        this.n = n;
    }

    @TestObjectCreate static AtUnitExample3 create()
    {
        return new AtUnitExample3(47);
    }

    public static void main(String[] args)
    {
        OSExecute.command("java -cp E:\\JavaProjects\\ThinkingInJava\\out\\production\\ThinkingInJava net.mindview.atunit.AtUnit out\\production\\ThinkingInJava\\com\\xujiaji\\thingking\\_20\\unit_example\\AtUnitExample3");
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

    @Test boolean initialization()
    {
        return n == 47;
    }

    @Test boolean methodOneTest()
    {
        return methodOne().equals("This is methodOne");
    }

    @Test boolean m2()
    {
        return methodTwo() == 2;
    }
}
