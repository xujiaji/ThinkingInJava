package com.xujiaji.thingking._10;

/**
 * Created by jiaji on 2018/3/10.
 */
class WithInner {
    class Inner {}
}
public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi) {
        wi.super();
    }
}
