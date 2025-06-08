package chap1.sample;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        
        Duck model = new ModelDuck();
        // 기본 상으로는 날 수 없지만
        model.performFly();
        // 동적으로 날 수 있게 설정할 수 있음
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
