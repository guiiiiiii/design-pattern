package chap1.sample;

public abstract class Duck {

    // 이렇게 오리 클래스에는 FlyBehavior와 QuackBehavior 라는 인터페이스(클래스)가 있음
    // 이렇게 두 개 이상의 클래스를 합치는 것을 "구성(Composition)" 이라고 함
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim (){
        System.out.println("모든 오리는 물에 뜰 수 있다!");
    }

    // 근데 지금까지의 버전을 살펴보면, 동적으로 설정을 할 수 있게 만들어놨지만 클래스 생성 시에 설정하고 실제로는 동적으로 활용하지 못하고있음
    // 이를 동적으로 설정할 수 있게 하기 위해 setter method를 추가할 필요가 있다

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
    
}