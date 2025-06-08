package chap1.sample.Quiz;

import chap1.sample.QuackBehavior;

public abstract class Caller {
    QuackBehavior quackBehavior;

    public void display(){}

    public void performCall() {
        quackBehavior.quack();
    }
}
