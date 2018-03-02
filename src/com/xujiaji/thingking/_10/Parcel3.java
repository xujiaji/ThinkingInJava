package com.xujiaji.thingking._10;

/**
 * Created by jiaji on 2018/3/2.
 */
public class Parcel3 {
    class Contents {
        private int i = 11;
        public int value() {
            return i; }
    }
    class Destination {
        private String label;
        Destination(String whereTo) { label = whereTo; }
        String readLabel() { return label; }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("dsaf");
    }
}
