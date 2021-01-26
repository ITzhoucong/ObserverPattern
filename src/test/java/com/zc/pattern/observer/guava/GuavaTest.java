package com.zc.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/26 15:26
 * @description:
 */
public class GuavaTest {

    public static void main(String[] args) {
//        消息总线
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("Hello");

//        Guava实现观察者类似从Struts到SpringMVC的升级
//        因为Struts面向的类，而SpringMVC面向的是方法

//        前面两者面向的是类，Guava面向的是方法

//        Guava是能够轻松落地观察者模式的一种解决方案
    }
}
