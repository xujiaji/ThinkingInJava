package com.xujiaji.thingking._15;

public class Wildcards
{
    static void rawArgs(Holder holder, Object org)
    {
        holder.set(org);
        holder.set(new Wildcards());
        Object obj = holder.get();
    }

    static void unboundedArg(Holder<?> holder, Object arg)
    {
//        holder.set(arg);
        Object obj = holder.get();
    }

    static <T> T exact1(Holder<T> holder)
    {
        T t = holder.get();
        return t;
    }

    static <T> T exact2(Holder<T> holder, T arg)
    {
        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> T wildSubtype(Holder<? extends T> holder, T arg)
    {
//        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> void wildSupertype(Holder<? super T> holder, T arg)
    {
        holder.set(arg);
        Object obj = holder.get();
    }
}
