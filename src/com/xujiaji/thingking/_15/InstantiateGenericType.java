package com.xujiaji.thingking._15;

import static net.mindview.util.Print.print;

class ClassAsFactory<T>
{
    T x;
    public ClassAsFactory(Class<T> kind)
    {
        try
        {
            x = kind.newInstance();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

class Empoyee {}


public class InstantiateGenericType
{
    public static void main(String[] args)
    {
        ClassAsFactory<Empoyee> fe = new ClassAsFactory<>(Empoyee.class);
        print("ClassAsFactory<Empoyee> 创建成功");
        try
        {
            ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        } catch (Exception e)
        {
            print("ClassAsFactory<Integer>创建失败");
        }
    }
}
