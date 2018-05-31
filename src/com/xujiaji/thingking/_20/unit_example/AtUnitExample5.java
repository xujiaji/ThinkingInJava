package com.xujiaji.thingking._20.unit_example;

import com.xujiaji.thingking._20.unit.*;
import net.mindview.util.OSExecute;

import java.io.PrintWriter;

public class AtUnitExample5
{
    @TestProperty
    static PrintWriter output;
    @TestProperty static int counter;
    private String text;

    public AtUnitExample5(String text)
    {
        this.text = text;
    }

    @TestObjectCreate static AtUnitExample5 create()
    {
        String id = Integer.toString(counter++);
        try{
            output = new PrintWriter("Test" + id + ".txt");
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        return new AtUnitExample5(id);
    }

    @TestObjectCleanup  static void cleanup(AtUnitExample5 tobj)
    {
        System.out.println("Running cleanup");
        output.close();
    }

    public static void main(String[] args)
    {
        OSExecute.command("java -cp E:\\JavaProjects\\ThinkingInJava\\out\\production\\ThinkingInJava com.xujiaji.thingking._20.unit.AtUnit out\\production\\ThinkingInJava\\com\\xujiaji\\thingking\\_20\\unit_example\\AtUnitExample5");
//        OSExecute.command("java -cp E:\\JavaProjects\\ThinkingInJava\\out\\production\\ThinkingInJava com.xujiaji.thingking._20.unit.AtUnitRemover -r out\\production\\ThinkingInJava\\com\\xujiaji\\thingking\\_20\\unit_example\\AtUnitExample5");
    }

    @Override
    public String toString()
    {
        return text;
    }

    @Test boolean test1()
    {
        output.print("test1");
        return true;
    }

    @Test boolean test2()
    {
        output.print("tes2");
        return true;
    }

    @Test boolean test3()
    {
        output.print("test3");
        return true;
    }
}
