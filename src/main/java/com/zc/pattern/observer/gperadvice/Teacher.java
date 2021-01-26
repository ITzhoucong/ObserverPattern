package com.zc.pattern.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/26 11:11
 * @description: 观察者
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Question question = (Question) arg;
        System.out.println("------------------");
        System.out.println(this.name + "老师，您好!\n"+
                "您收到了一个来自“" + gPer.getName() +"”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者："+ question.getUsername());
    }
}
