package chap1.sample;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다");
    }
    
    
}
