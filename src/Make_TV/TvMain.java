package Make_TV;

public class TvMain {
    public static void main(String[] args) {
        TV samsungTV = new TV(); // 기본 생성자 호출
        TV lgTV = new TV(true, 59,15); // 매개변수가 있는 생성자 호출

        lgTV.getTV();

        samsungTV.setON(true);
        samsungTV.setChannel(1000);
        samsungTV.setVolume(101);
        samsungTV.getTV();


    }
}
