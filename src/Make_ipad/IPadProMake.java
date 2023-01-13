package Make_ipad;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class IPadProMake {
    int screen;  // 화면 크기 : 11인치, 12.9인치
    int color;   // 색상 : 스페이스 그레이 / 실버
    int memory;  // 용량 : 128GB, 256GB, 512GB, 1TB
    int network; // 네트워크 : Wi-fi, Wi-fi+Cellular
    String service;
    String name; // 각인 서비스시 이름 저장
    String productDate; // 제품 생산 일자 (시리얼 넘버를 만들 때 사용)
    String serialNum;   // 제품 일련 번호 : ipad13128C2301121
    static int cnt = 0; // 클래스 변수 : 객체 생성 시 생성되지 않고 클래스 생성 시 만들어 짐 .
    IPadProMake(String name) {
        this.name = name;
        Date now = new Date(); // 현재의 시간 정보를 가져오기 위해 사용
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now); // 시간 정보 중 "yyMMdd" 패턴으로 시간 정보를 가져옴 .
        cnt ++; // 생성자는 객체가 만들어 질 때 호출되므로 생성된 객체의 횟수를 확인하는 용도로 사용할 수 있음 .
        productDate += cnt; // 연월일 + 생산댓수
    }
    // 제품 구매에 대한 진행 여부를 묻는 메뉴 만들기
    boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======== iPad Pro 구매하기 =======");
        while (true) {
            System.out.print("구입은 [yes] / 종료는 [quit] 입력 : ");
            String isContinue = sc.next();
            if (isContinue.equalsIgnoreCase("yes")) return true;
            else if (isContinue.equalsIgnoreCase("quit")) {
                System.out.println("구매 프로그램을 종료합니다.");
                return false;
            } else System.out.println("잘 못 누르셨습니다. 용량을 다시 선택하세요. ");
        }
    }
    // 화면 크기 정하기
    void setScreen() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("디스플레이 선택 [1] 11인치 [2] 12.9인치 : ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return; // 여기서 해당 메소드가 끝남 .
            System.out.println("잘 못 누르셨습니다. 디스플레이를 다시 선택하세요.");
        }
    }

    // 컬러 선택
    void setColor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("색상 선택 [1] 스페이스 그레이 [2] 실버 : ");
            color = sc.nextInt();
            if (color == 1 || color == 2) return; // 여기서 해당 메소드가 끝남 .
            System.out.println("잘 못 누르셨습니다. 색상을 다시 선택하세요.");
        }
    }
    //용량 선택
    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택 [1] 128GB [2] 256GB [3] 512GB [4] 1TB : ");
            memory = sc.nextInt();
            if (memory > 0 && memory < 5) return; // 여기서 해당 메소드가 끝남 .
            System.out.println("잘 못 누르셨습니다. 용량을 다시 선택하세요. ");
        }
    }
    // 네트워크 옵션 선택
    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("네트워크 옵션 선택 [1] Wi-fi [2] Wi-fi+Cellular : ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return; // 여기서 해당 메소드가 끝남 .
            System.out.println("잘 못 누르셨습니다. 네트워크 옵션을 다시 선택하세요.");
        }
    }
    // 각인 서비스 신청
    void setName() {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.print("각인 서비스를 신청 하시겠습니까? Yes / No ");
        service = sc.next();
            if (service.equalsIgnoreCase("yes")) {
                System.out.print("이름을 입력 하세요 : ");
                name = sc.next();
                return;
            } else if (service.equalsIgnoreCase("no")) return;
            else System.out.println("잘 못 누르셨습니다. 서비스 신청 여부를 다시 입력하세요.");
        }
    }

//                System.out.print("구입은 yes / 종료는 quit : ");
//                String isContinue = sc.next();
//                if(isContinue.equalsIgnoreCase("yes")) return true;
//                else if (isContinue.equalsIgnoreCase("no")) return false;
//                else System.out.println("잘 못 누르셨습니다. 용량을 다시 선택하세요. ");

    // 일련 번호 만들기 : iPad + 11/13 + 123/256/512/1024 + W/C + 230112 + 생산댓수
    void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + screenStr + memStr[memory] + netStr + "230112" + cnt;
        System.out.println("기기의 일련 번호는 " + serialNum + "입니다.");
    }
    // 제품 구매가 완료 되면 출고까지 30초 대기 이후 출고 하기
    void inProductPad() throws InterruptedException {
        while(true) {
            sleep(300);
            cnt++;
            System.out.print(" << iPad Pro 제작 중 : [ " + cnt + "%] >>");
            System.out.print("\r");
            if(cnt >= 100) break;
        }
    }
    void productPad() {
        final String[] scrType = {"", "11인치", "12.9인치"};
        final String[] colorType = {"", "스페이스 그레이", "실버"};
        final String[] memType = {"", "128", "256", "512", "1024" };
        final String[] netType = {"", "Wi-fi", "Wi-fi+Cellular"};
        System.out.println("======== iPad Pro 가 출고 되었습니다. =======");
        System.out.println(" 디스플레이 : " + scrType[screen]);
        System.out.println(" 제품 색상 : " + colorType[color]);
        System.out.println(" 제품 용량 : " + memType[memory]);
        System.out.println(" 네트워크  : " + netType[network]);
        System.out.println("   이름   : " + name);
        System.out.println(" 일련 번호 : " + serialNum);
        System.out.println("========================================");
    }
}
