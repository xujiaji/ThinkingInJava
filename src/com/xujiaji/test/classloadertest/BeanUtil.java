package com.xujiaji.test.classloadertest;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class BeanUtil
{
    public static Object getCommand(Map<String, Object> requestMap,
                                    String commandClass)
            throws Exception
    {
        Class c = Class.forName(commandClass);
        Object o = c.newInstance();

        return updateCommand(requestMap, o);
    }

    public static Object updateCommand(
            Map<String, Object> requestMap,
            Object command)
            throws Exception
    {
        Method[] methods =
                command.getClass().getDeclaredMethods();

        for (Method method : methods)
        {
            // 过滤private和protected，并且set开头的方法
            if (!Modifier.isPrivate(method.getModifiers()) &&
                    !Modifier.isProtected(method.getModifiers()) &&
                    method.getName().startsWith("set"))
            {
                String name = method.getName()
                        .substring(3)
                        .toLowerCase();
                if (requestMap.containsKey(name))
                {
                    method.invoke(command, requestMap.get(name));
                }
            }
        }
        return command;
    }
}

class BeanUtilDemo
{
    public static void main(String[] args) throws Exception
    {
        Map<String, Object> request = new HashMap<>();
        request.put("name", "caterpillar");
        request.put("score", 90);
        Object obj = BeanUtil.getCommand(request, "com.xujiaji.test.classloadertest.Student");
        System.out.println(obj);
    }
}