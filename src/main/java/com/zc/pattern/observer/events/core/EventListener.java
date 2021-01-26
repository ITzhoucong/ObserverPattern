package com.zc.pattern.observer.events.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/26 11:37
 * @description: 监听器，他就是观察者
 */
public class EventListener {

    /**
     * JDK底层的Listener通常也是这样来设计的
     */
    protected Map<String, Event> events = new HashMap<>();

    /**
     * 事件名称和一个目标对象来触发事件
     *
     * @param eventType
     * @param target
     */
    public void addListener(String eventType, Object target) {
        try {
            this.addListener(eventType, target, target.getClass().getMethod("on" + toUpperFirstCase(eventType),Event.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addListener(String eventType, Object target, Method callback) {
//        注册事件
        events.put(eventType, new Event(target, callback));
    }


    /**
     * 触发，只要有动作就触发
     *
     * @param event
     */
    private void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try {
//            发起回调
            event.getCallback().invoke(event.getTarget(), event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 事件名称触发
     *
     * @param trigger
     */
    protected void trigger(String trigger) {
        if (!this.events.containsKey(trigger)) {
            return;
        }
        Event e = this.events.get(trigger);
        e.setTrigger(trigger);
        trigger(e);
    }

    /**
     * 首字母大写
     *
     * @param str
     * @return
     */
    private String toUpperFirstCase(String str) {
        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
