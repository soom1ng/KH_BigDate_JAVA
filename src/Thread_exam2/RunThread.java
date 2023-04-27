package Thread_exam2;

public class RunThread implements Runnable {
    @Override
    public void run() {
//        System.out.println("Runnable 인터페이스를 상속받아서 스레드를 만드는 방법");
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("인터페이스 상속 스레드 : " + Thread.currentThread() + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}
