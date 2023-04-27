package Thread_exam2;
// 스레드 생성 방법
// - 상속을 받는 방법 (extends Thread) : 구현이 간편, 다른 상속을 받지 못한다는 단점이 있음 .
// - Runnable 인터페이스로 구현 : 다른 클래스의 상속을 받을 수 있음, 스레드 객체 만든느 과정이 필요함 .
// - 익명의 객체로 구현 : 클래스 생성이 없이 간편하게 구현할 수 있음 .
public class ThreadEx2 {
    public static void main(String[] args) {
        Thread clsTh1 = new CustomThread();
        clsTh1.start(); // 내부적으로 run() 메소드가 호출 됨 .
        Runnable run = new RunThread(); // 수행해야 할 작업 내용은 포함하고 있지만 실제 스레드는 아님 .
        Thread runTh1 = new Thread(run);
        Thread runTh2 = new Thread(run);
        runTh1.start();
        runTh2.start();

        // 익명의 객체 생성
        Runnable task = new Runnable() {
            @Override
            public void run() {

                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                    System.out.println("클래스 상속 스레드 : " + Thread.currentThread() + sum);
                }
                System.out.println(Thread.currentThread() + "합계 : " + sum);
            }
        };
        Thread runTh3 = new Thread(task);
        runTh3.start();

        // 익명의 객체를 람다식으로 생성
        Runnable task2 = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
                System.out.println("클래스 상속 스레드 : " + Thread.currentThread() + sum);
            }
            System.out.println(Thread.currentThread() + "합계 : " + sum);
        };

        Thread runTh4 = new Thread(task2);
        runTh4.start();

        System.out.println("제가 메인 스레드 입니다.");
        System.out.println("제가 메인 스레드 입니다.");
        System.out.println("제가 메인 스레드 입니다.");
        System.out.println("제가 메인 스레드 입니다.");
    }
}
