package com.zc.pattern.observer.gperadvice;

import java.util.Observable;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/26 11:04
 * @description: JDK提供的一种观察者的实现方式 被观察者
 */
public class GPer extends Observable {

    private String name = "GPer生态圈";
    private static GPer gPer = null;

    private GPer(){}

    public static GPer getInstance(){
        if (null == gPer){
            gPer = new GPer();
        }
        return gPer;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUsername() + "在" + this.name + "上发布了一个问题");
        setChanged();
        notifyObservers(question);
    }

}
