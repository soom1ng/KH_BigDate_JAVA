package Make_TV;

public class TvMain {
    public static void main(String[] args) {
        Tv samsungTv = new Tv(); // 기본 생성자 호출
        Tv lgTv = new Tv(true, 59,15); // 매개변수가 있는 생성자 호출

        lgTv.getTV();

        samsungTv.setON(true);
        samsungTv.setChannel(1000);
        samsungTv.setVolume(101);
        samsungTv.getTV();

    }
}
