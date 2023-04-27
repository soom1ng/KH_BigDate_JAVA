package Thread_exam6;

public class RunThread extends Thread {
    private boolean stop; // stop 플래그 생성

    public void setStop(boolean stop) {
        this.stop = stop;
    }
    @Override
    public void run() {
        while (!stop) {
            System.out.println("Thread 실행 중 ..");

        }
        System.out.println("종료를 위한 자원 정리 ..");
        System.out.println("실행종료");
    }
}
