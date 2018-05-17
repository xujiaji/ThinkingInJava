package com.xujiaji.test.classloadertest;

import java.lang.reflect.Field;

public class TestField {
    private int testInt;
    private String testString;
    
    public String toString() {
        return testInt + ":" + testString;
    }
}

class AssignFieldDemo {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.xujiaji.test.classloadertest.TestField");
            Object targetObj = c.newInstance();

            Field testInt = c.getDeclaredField("testInt");
            testInt.setAccessible(true);
            testInt.setInt(targetObj, 99);

            Field testString = c.getDeclaredField("testString");
            testString.setAccessible(true);
            testString.set(targetObj, "caterpillar");

            System.out.println(targetObj);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有指定類別");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到指定的類別");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            System.out.println("找不到指定的資料成員");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}