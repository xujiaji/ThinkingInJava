package com.xujiaji.thingking._15;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import static com.xujiaji.thingking._15.Tuple.tuple;

class MixinProxy implements InvocationHandler
{
    Map<String, Object> delegateByMethod;

    public MixinProxy(TwoTuple<Object, Class<?>> ... pairs)
    {
        delegateByMethod = new HashMap<>();
        for (TwoTuple<Object, Class<?>> pair : pairs)
        {
            for (Method method : pair.second.getMethods())
            {
                String methodName = method.getName();
                if (!delegateByMethod.containsKey(methodName))
                {
                    delegateByMethod.put(methodName, pair.first);
                }
            }
        }
    }

    public static Object newInstance(TwoTuple ... paris)
    {
        Class[] interfaces = new Class[paris.length];
        for (int i = 0; i < paris.length; i++)
        {
            interfaces[i] = (Class) paris[i].second;
        }
        ClassLoader cl = paris[0].first.getClass().getClassLoader();
        return Proxy.newProxyInstance(cl, interfaces, new MixinProxy(paris));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        String methodName = method.getName();
        Object delegate = delegateByMethod.get(methodName);
        return method.invoke(delegate, args);
    }
}

public class DynamicProxyMixin
{
//    Object mixin = MixinProxy.newInstance(
//            tuple(new BasicI)
//    )
}
