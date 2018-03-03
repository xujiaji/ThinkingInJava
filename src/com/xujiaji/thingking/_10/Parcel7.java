package com.xujiaji.thingking._10;

/**
 * Created by jiaji on 2018/3/3.
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }
}
