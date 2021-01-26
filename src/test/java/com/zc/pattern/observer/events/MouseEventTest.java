package com.zc.pattern.observer.events;

import com.zc.pattern.observer.events.core.Event;
import com.zc.pattern.observer.events.mouseevent.Mouse;
import com.zc.pattern.observer.events.mouseevent.MouseEventCallback;
import com.zc.pattern.observer.events.mouseevent.MouseEventType;

import java.lang.reflect.Method;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/26 12:28
 * @description:
 */
public class MouseEventTest {

    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();
//        添加监听
        mouse.addListener(MouseEventType.ON_CLICK,callback);
        mouse.addListener(MouseEventType.ON_FOCUS,callback);

        mouse.click();
        mouse.focus();
    }
}
