package com.zc.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/26 15:23
 * @description:
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法,传入的参数是：" + str);
    }
}
