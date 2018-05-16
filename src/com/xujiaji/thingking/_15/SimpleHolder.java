package com.xujiaji.thingking._15;

public class SimpleHolder {
    private Object obj;

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("item");
        String s = (String) holder.get();
    }

    public void set(Object obj) {
        this.obj = obj;
    }

    public Object get() { return obj; }
}
