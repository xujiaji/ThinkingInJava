package com.xujiaji.thingking._15;

public class GenericArray2<T>
{
    private Object[] array;

    public GenericArray2(int sz)
    {
        array = new Object[sz];
    }

    public static void main(String[] args)
    {
        GenericArray2<Integer> gai = new GenericArray2<>(10);
        for (int i = 0; i < 10; i++)
        {
            gai.put(i, i);
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.print(gai.get(i) + " ");
        }
        System.out.println();
        try{
            Integer[] ia = gai.rep();
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void put(int index, T item)
    {
        array[index] = item;
    }

    public T[] rep()
    {
        return (T[]) array;
    }

    public Object get(int index)
    {
        return array[index];
    }
}
