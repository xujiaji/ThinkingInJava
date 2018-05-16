package com.xujiaji.thingking._15;

public interface Payable<T>
{
}

class Employee implements Payable<Employee>
{

}

class Hourly extends Empoyee implements Payable<Hourly>
{

}

class Test
{
    public static void main(String[] args)
    {
        new Employee();
        new Hourly();
    }
}
