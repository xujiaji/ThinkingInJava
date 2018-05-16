package com.xujiaji.thingking._15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;

public class NeedCasting
{
    public void f(String[] args) throws Exception
    {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(args[0]));
//        List<Widget> shapes = (List<Widget>) in.readObject();
        List<Widget> shapes = List.class.cast(in.readObject());
    }
}
