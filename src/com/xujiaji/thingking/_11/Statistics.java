package com.xujiaji.thingking._11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics
{
    public static void main(String[] args)
    {
        Random ran = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++)
        {
            int r = ran.nextInt(20);
            Integer freg = m.get(r);
            m.put(r, freg == null ? 1 : freg + 1);
        }
        System.out.println(m.toString());
    }
}
