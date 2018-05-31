package com.xujiaji.thingking._20.sql;

@DBTable(name = "MEMBER")
public class Member
{
    static int memberCount;
    @SQLString(30) String firstName;
    @SQLString(50) String lastName;
    @SQLInteger Integer age;
    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handle;

    @Override
    public String toString()
    {
        return handle;
    }

    public String getHandle()
    {
        return handle;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Integer getAge()
    {
        return age;
    }
}
