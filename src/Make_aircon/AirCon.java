package Make_aircon;

import java.util.Calendar;
import java.util.Scanner;

// 기능 설계
// - 전원 ON/OFF 기능
// = 온도 설정 기능 (1도 단위로 설정함 .)
// - 현재 온도 표시 기능
// - 냉방기 ON/OFF 기능
// - 난방기 ON/OFF 기능
// - 바람의 세기 설정 (1단계 / 2단계 / 3단계)
// 설정 조건 및 동작
// - 설정된 온도에 따른 온도 조절 기능 (60초/30초/20초) 주기로 온도 변경
// - 에어컨의 동작은 Scanner 으로 특정 문자를 입력 받아 동작 시킴 .
// - 현재 온도 표시를 위한 캘린더 API 활용해서 현재 날짜에 대한 적절한 온도를 가져오도록 구현
// - 현재 온도와 설정 온도가 같아지면 자동 종료
public class AirCon {
    private boolean isPower; // 전원 ON/OFF 기능
    private int setTemp; // 온도 설정 기능
    private int viewTemp; // 현재 온도 표시 기능
    private boolean isCooler; // 냉방기 ON/OFF 기능
    private boolean isHeater; // 난방기 ON/OFF 기능
    private int windyStep; // 바람 세기 설정 ( 1단계/2단계/3단계)

    public AirCon() {
        final int[] monthTemp = {-5, -3, 3, 9, 15, 22, 29, 32, 25, 18, 11, 2};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH); // 현재 달을 가져옴 .
        viewTemp = monthTemp[month];
        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windyStep = 1;
    }
    // 에어컨의 온도가 변경 될 때, 화면 출력
    public void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        final String[] windyStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("======== 에어컨 정보 ========");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + viewTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("냉방기 : " + coolerStr);
        System.out.println("난방기 : " + heaterStr);
        System.out.println("바람 세기 :" + windyStr[windyStep]);
        System.out.println("==========================");
    }
    // 에어컨에 대해 온도와 바람세기 설정, 설정 이후 조건에 따라 냉방기 또는 난방기를 켬
    public void setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재의 온도는 " + viewTemp + "입니다.");
        System.out.print("원하는 설정 온도를 입력하세요 : ");
        setTemp = sc.nextInt();
        System.out.print("바람 세기를 설정하세요. [1단계]/[2단계]/[3단계] : ");
        windyStep = sc.nextInt();
        System.out.println("설정된 온도는 " + setTemp + "도 입니다.");
        if (viewTemp > setTemp) { // 현재 온도가 더운 상태
            System.out.println("냉방기가 동작합니다.");
            isCooler = true;
            isHeater = false;
        } else if (viewTemp < setTemp) { // 현재 온도가 추운 상태
            System.out.println("난방기가 동작합니다.");
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }
    public void setPower(boolean power) {
        isPower = power;
    }
    public int getWindyStep() {
     return windyStep;
    }
    public boolean isCooler() {
        return isCooler;
    }
    public boolean isHeater() {
        return isHeater;
    }
    public void setViewTemp(int n) {
        viewTemp += n;
    }
    public int getViewTemp() {
        return viewTemp;
    }
    public int getSetTemp() {
        return setTemp;
    }
}
