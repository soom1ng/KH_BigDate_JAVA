package Make_TV;
// Television 만들기
public class TV {
    private boolean isON; // 전원 버튼, 접근 제한자 private 설정 (같은 클래스 내에서만 접근 가능)
    private int channel; // 0 ~ 999
    private int volume; // 0 ~ 100

    TV() {
        isON = false;
        channel = 10;
        volume = 10;
        System.out.printf("기본생성자 호출, 전원 : %b, 채널 : %d, 볼륨 : %d\n", isON ,channel, volume);
    }
    TV(boolean isON, int cnl, int vol) {
        this.isON = isON;
        channel = cnl;
        volume = vol;
    }
    // 외부에서 전원을 ON/OFF 할 수 있는 기능을 제공 (리모콘 기능)
    public void setON(boolean isON) {
        this.isON = isON;
        String onoffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV가 " + onoffStr + "되었습니다.");
    }
    // 외부에서 채널을 변경할 수 있는 기능을 제공
    public  void setChannel(int cnl) {
        if(cnl >=0 && cnl <= 999) {
            channel = cnl;
            System.out.println("채널을 " + channel + "로 변경하였습니다.");
        } else {
            System.out.println("채널의 설정 범위가 아닙니다.");
        }
    }

    // 외부에서 볼륨을 변경할 수 있는 기능을 제공
    public  void setVolume(int vol) {
        if(vol >=0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 " + vol + "로 변경하였습니다.");
        } else {
            System.out.println("볼륨 설정 범위가 아닙니다.");
        }
    }
    public void getTV() {
        String onoffStr = (isON) ? "ON" : "OFF";
        System.out.println("======= TV State =======");
        System.out.printf("전원 : %s\n", onoffStr);
        System.out.printf("볼륨 : \n", volume);
        System.out.printf("채널 : \n", channel);
    }

}
