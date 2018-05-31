package com.xujiaji.thingking._20.unit_example;


import net.mindview.atunit.Test;
import net.mindview.util.OSExecute;

public class AtUnitExternalTest extends AtUnitExample
{
    public static void main(String[] args)
    {
        OSExecute.command("java -cp java -cp E:\\JavaProjects\\ThinkingInJava\\out\\production\\ThinkingInJava net.mindview.atunit.AtUnit out\\production\\ThinkingInJava\\com\\xujiaji\\thingking\\_20\\unit_example\\AtUnitExternalTest");
    }

    @Test boolean _methodOne() {
        return methodOne().equals("This is methodOne");
    }

    @Test boolean _methodTwo()
    {
        return methodTwo() == 2;
    }
}
