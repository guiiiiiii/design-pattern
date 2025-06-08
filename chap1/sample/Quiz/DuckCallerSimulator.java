package chap1.sample.Quiz;

public class DuckCallerSimulator {
    public static void main(String[] args) {
        // [뇌단련] 오리소리를 내기 위한 호출기를 만드는 방법을 생각

        // 내 풀이 : 추상클래스 호출기를 만들어서, 소리를 내는 행동에 quackBehavior를 추가해서 소리를 내게 하고,
        // 오리 호출기에는 quack 을 사용하여 꽥소리가 나는 호출기를 생성
        DuckCaller duckCaller = new DuckCaller();
        duckCaller.performCall();
        duckCaller.display();
    }
}
