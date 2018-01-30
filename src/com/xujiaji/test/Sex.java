package com.xujiaji.test;

import java.util.List;

public class Sex
{
    private int id;
    private String title;
    private List<Size> list;

    public Sex(int id, String title, List<Size> list)
    {
        this.id = id;
        this.title = title;
        this.list = list;
    }

    public Sex(){}

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public List<Size> getList()
    {
        return list;
    }

    public void setList(List<Size> list)
    {
        this.list = list;
    }
}
