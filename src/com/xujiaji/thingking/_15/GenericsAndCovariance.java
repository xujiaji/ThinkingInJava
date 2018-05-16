package com.xujiaji.thingking._15;


import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance
{
    public static void main(String[] args)
    {
        List<? extends Fruit> flist = new ArrayList<>();
//        flist.add(new Apple());
//        flist.add(new Orange());
//        flist.add(new Object());
        flist.add(null);
        flist.get(0);
    }
}
