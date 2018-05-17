package com.xujiaji.test.classloadertest;

public class ClassLoaderTree
{
    public static void main(String[] args)
    {
        System.out.println(ClassLoader.getSystemClassLoader().toString());
        ClassLoader loader = ClassLoaderTree.class.getClassLoader();
        while (loader != null)
        {
            System.out.println(loader.toString());
            loader = loader.getParent();
        }
    }
}
