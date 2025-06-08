package chap1.sample.Quiz;

import chap1.sample.Quack;

public class DuckCaller extends Caller {

    public DuckCaller() {
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("오리모양의 호출기");
    }
}
