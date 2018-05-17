package com.xujiaji.test.classloadertest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class Test
{
    public static void testClassIdentity()
    {
        String classDataRootPath = "D:\\Documents\\test";
        FileSystemClassLoader fscl1 = new FileSystemClassLoader(classDataRootPath);
        FileSystemClassLoader fscl2 = new FileSystemClassLoader(classDataRootPath);

        String className = "com.xujiaji.test.classloadertest.Sample";


        try
        {
            Class<?> class1 = fscl1.loadClass(className);
            Object obj1 = class1.newInstance();

            Class<?> class2 = fscl2.loadClass(className);
            Object obj2 = class2.newInstance();

            
            Method setSampleMethod = class1.getMethod("setSample", Object.class);

            setSampleMethod.invoke(obj1, obj2);


            System.out.println(obj1.getClass().getClassLoader());
            System.out.println(obj2.getClass().getClassLoader());

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
//        testClassIdentity();
//        Thread thread1 = new Thread(){
//            @Override
//            public void run()
//            {
//                System.out.println();
//            }
//        };
//        System.out.println(Test.class.getClassLoader());
//        System.out.println(thread1.getContextClassLoader());
        System.out.println(System.getProperty("sun.boot.class.path"));

        System.out.println( System.getProperty("java.ext.dirs") );

        System.out.println(System.getProperty("java.class.path") );
    }
}