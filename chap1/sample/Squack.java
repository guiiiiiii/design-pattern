package chap1.sample;

public class Squack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("삑삑!");
    }
    
}
