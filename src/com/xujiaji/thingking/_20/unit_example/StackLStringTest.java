package com.xujiaji.thingking._20.unit_example;

import net.mindview.atunit.Test;
import net.mindview.util.OSExecute;

public class StackLStringTest extends StackL<String>
{
    public static void main(String[] args)
    {
        OSExecute.command("java -cp E:\\JavaProjects\\ThinkingInJava\\out\\production\\ThinkingInJava net.mindview.atunit.AtUnit out\\production\\ThinkingInJava\\com\\xujiaji\\thingking\\_20\\unit_example\\StackLStringTest");

    }

    @Test void _push()
    {
        push("one");
        assert top().equals("two");
        push("two");
        assert top().equals("two");
    }

    @Test void _pop()
    {
        push("one");
        push("two");
        assert pop().equals("two");
        assert pop().equals("one");
    }

    @Test void _top()
    {
        push("A");
        push("B");
        assert top().equals("B");
        assert top().equals("B");
    }
}
