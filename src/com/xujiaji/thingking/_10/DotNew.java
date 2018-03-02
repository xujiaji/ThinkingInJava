package com.xujiaji.thingking._10;

/**
 * Created by jiaji on 2018/3/2.
 */
public class DotNew {
    public class Inner {}
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
