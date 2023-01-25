package Make_car_Final;

import java.util.Scanner;

public class CarTotalMain {
    public static void main(String[] args) {
        final int[] dt = {0, 400, 150, 200, 300}; // 인덱스로 해당 거리를 구함 .
        MakeCar car = null; // 부모 클래스에서 선택된 차량의 객체를 연결하기 위한 참조 변수
        Scanner sc = new Scanner(System.in);
        System.out.println("이동 지역을 선택 하세요 [1] 부산 [2] 대전 [3] 강릉 [4] 광주 : ");
        int city = sc.nextInt();
//        switch (city) {
//            case "부산": dt = 400; break;
//            case "대전": dt = 200; break;
//            case "강릉": dt = 150; break;
//            case "광주": dt = 300; break;
//        }

        System.out.println("이동하는 인원 수를 입력 하세요 (1~100명 이내) : ");
        int passCnt = sc.nextInt();


        System.out.println("이동 차량을 선택 하세요 [1] 스포츠카 [2] 승용차 [3] 버스 : ");
        int selCar = sc.nextInt();

        System.out.println("부가기능을 사용하시겠습니까? [ON]/[OFF] : ");
        int option = sc.nextInt();
        boolean isOption = (option == 1) ? true : false;

        switch (selCar) {
            case 1:
                car = new SportsCar("Ferrari");
                break;
            case 2:
                car = new VehicleCar("GV80");
                break;
            case 3:
                car = new BusCar("타요 버스");
                break;
            default:
                System.out.println("차량이 잘 못 선택 되었습니다.");
        }
        car.setMode(isOption);
        int moveCnt = car.getMoveCnt(passCnt);
        System.out.println("======== " + car.getName()+ "========");
        System.out.printf("이동에 필요한 총 비용 : %d원\n", car.getTotalCost(dt[city], moveCnt));
        System.out.printf("주유 횟수 : %d번\n", car.getRefuelCnt(dt[city], moveCnt));
        System.out.printf("총 소요 시간 : %.2f시간\n", car.getTotalTime(dt[city], moveCnt));
    }
}
