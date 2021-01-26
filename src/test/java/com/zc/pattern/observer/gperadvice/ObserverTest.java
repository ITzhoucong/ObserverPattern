package com.zc.pattern.observer.gperadvice;

import com.zc.pattern.observer.gperadvice.GPer;
import com.zc.pattern.observer.gperadvice.Question;
import com.zc.pattern.observer.gperadvice.Teacher;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/26 11:18
 * @description:
 */
public class ObserverTest {

    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Question question = new Question();
        question.setUsername("小明");
        question.setContent("观察者模式适用哪些场景?");
        gPer.addObserver(tom);
        gPer.publishQuestion(question);
    }
}
