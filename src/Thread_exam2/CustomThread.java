package Thread_exam2;

public class CustomThread extends Thread {
    @Override
    public void run() { // 스레드가 실행되는 부분
//        System.out.println("Thread 를 상속받아서 만드는 방법 ");
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("클래스 상속 스레드 : " + Thread.currentThread() + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}
