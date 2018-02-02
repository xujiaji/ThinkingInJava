package com.xujiaji.thingking._5;

class Book
{
    boolean checkedOut = false;
    Book(boolean checkout)
    {
        checkedOut = checkout;
    }
    void checIn()
    {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable
    {
        if (checkedOut)
        {
            System.out.println("Error: checked out");
        }
    }
}

public class TerminationCondition
{

    public static void main(String[] args)
    {
        Book novel = new Book(true);
        novel.checIn();
        new Book(true);
        System.gc();
    }
}
