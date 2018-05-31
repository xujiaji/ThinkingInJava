package com.xujiaji.thingking._20.unit_example;

import net.mindview.atunit.Test;
import net.mindview.util.OSExecute;

import java.io.FileInputStream;
import java.io.IOException;

public class AtUnitExample2
{
    public static void main(String[] args)
    {
        OSExecute.command("java -cp E:\\JavaProjects\\ThinkingInJava\\out\\production\\ThinkingInJava net.mindview.atunit.AtUnit out\\production\\ThinkingInJava\\com\\xujiaji\\thingking\\_20\\unit_example\\AtUnitExample2");
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

    @Test void assertExample()
    {
        assert methodOne().equals("This is methodOne");
    }

    @Test void assertFailureExample()
    {
        assert 1 == 2: "What a surprise!";
    }

    @Test void exceptionExample() throws IOException
    {
        new FileInputStream("nofile.txt");
    }

    @Test boolean assertAndReturn()
    {
        assert methodTwo() == 2: "methodTwo must equal 2";
        return methodOne().equals("This is methodOne");
    }

}
