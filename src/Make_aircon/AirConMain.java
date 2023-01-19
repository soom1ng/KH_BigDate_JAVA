package Make_aircon;

import java.util.Scanner;
import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon();
        Scanner sc = new Scanner(System.in); // 에어컨을 작동시키기 위해 콘솔 입력을 받음 .
        int elapsedTime = 0; // 경과 시간을 계산하기 위한 변수
        boolean isSetTemp = false; // 온도가 변경 되어야 할 조건 확인
        while (true) {
            System.out.print("에어컨을 켜시겠습니까? ( Yes / No ) : ");
            String isON = sc.next(); // 에어컨을 켜기 위한 문자열을 입력 받음 .
            if (isON.equalsIgnoreCase("yes")) {
                lgAirCon.setPower(true);
//            lgAirCon.airConInfo();
                lgAirCon.setAirConState(); // 온도와 바람 세기를 설정하고 설정에 따라 냉방기나 난방기 값 변경
                while (true) {
                    sleep(1000); // 1초
                    elapsedTime++;
                    switch (lgAirCon.getWindyStep()) {
                        case 1:
                            if (elapsedTime >= 6) isSetTemp = true;
                            break;
                        case 2:
                            if (elapsedTime >= 3) isSetTemp = true;
                            break;
                        case 3:
                            if (elapsedTime >= 2) isSetTemp = true;
                            break;
                        default:
                    }
                    if (isSetTemp) {
                        if (lgAirCon.isHeater()) lgAirCon.setViewTemp(1);
                        if (lgAirCon.isCooler()) lgAirCon.setViewTemp(-1);
                        lgAirCon.airConInfo();
                        isSetTemp = false;
                        elapsedTime = 0;
                    }
                    if (lgAirCon.getViewTemp() == lgAirCon.getSetTemp()) {
                        System.out.println("에어컨을 종료합니다.");
                        break;
                    }
                }
            } else if (isON.equalsIgnoreCase("no")) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
            } else System.out.println("잘 못 입력하셨습니다.");
        }
    }
}
