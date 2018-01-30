package com.xujiaji.test;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GsonTest
{
    public static void main(String[] args)
    {
        Size size1 = new Size(1, "30");
        Size size2 = new Size(2, "35");
        Size size3 = new Size(3, "40");
        Size size4 = new Size(4, "42");
        List<Size> list = new ArrayList<>(Arrays.asList(size1, size2, size3, size4));
        Sex sex1 = new Sex(1, "男", list);
        Sex sex2 = new Sex(2, "女", list);
        List<Sex> sexList = new ArrayList<>(Arrays.asList(sex1, sex2));
        System.out.println(new Gson().toJson(sexList));
    }
}
