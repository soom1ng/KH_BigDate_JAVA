package Make_car;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SetCarMain {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("스포츠카");
        sportsCar.setTurbo(true);
        sportsCar.getTurbo();
        sportsCar.getSpeed();
        sportsCar.infoSportCar();

        Vehicle vehicle = new Vehicle("승용차");
        vehicle.setTrunk(true);
        vehicle.getTrunk();
        vehicle.getSeat();
        vehicle.infoVehicle();

        Bus bus = new Bus("버스");
        bus.setTank(true);
        bus.getTank();
        bus.getOilSize();
        bus.infoBus();

        Scanner sc = new Scanner(System.in);
        int dt = 0;
        String selLoc;
        int manNum;
        int speedSet;
        String addFun;
        int selCar;
        int charge = 0;
        int oilCnt = 0;
        double driveTime = 0;

        Car car = null;

        System.out.println("이동 지역을 선택 하세요 [1] 부산 [2] 대전 [3] 강릉 [4] 광주 : ");
        selLoc = sc.next();
        switch (selLoc) {
            case "부산": dt = 400; break;
            case "대전": dt = 200; break;
            case "강릉": dt = 150; break;
            case "광주": dt = 300; break;
        }

        System.out.println("이동하는 인원 수를 입력 하세요 (1~100명 이내) : ");
        manNum = sc.nextInt();

//        while (true) {
//            System.out.println("부가기능을 사용하시겠습니까? [ON]/[OFF] : ");
//            addFun = sc.next();
//            if (addFun.equalsIgnoreCase("ON")) {
//                car.isOption = true;
//                break;
//            } else if (addFun.equalsIgnoreCase("OFF")) {
//                car.isOption = false;
//                break;
//            } else System.out.println("잘 못 입력하셨습니다.");
//        }

        System.out.println("이동 차량을 선택 하세요 [1] 스포츠카 [2] 승용차 [3] 버스 : ");
        selCar = sc.nextInt();

        switch (selCar) {
            case 1:
                speedSet = 250;
            {
                charge = (dt / sportsCar.fuelEff) * 2000;
                if (dt / sportsCar.fuelEff % sportsCar.oilSize == 0)
                    oilCnt = (dt / sportsCar.fuelEff) / sportsCar.oilSize;
                else oilCnt = (dt / sportsCar.fuelEff) / sportsCar.oilSize + 1;
                driveTime = dt / sportsCar.speed;
            }
            case 2:
                speedSet = 200;
            {
                charge = (dt / vehicle.fuelEff) * 2000;
                if (dt / vehicle.fuelEff % vehicle.oilSize == 0)
                    oilCnt = (dt / vehicle.fuelEff) / vehicle.oilSize;
                else oilCnt = (dt / vehicle.fuelEff) / vehicle.oilSize + 1;
                driveTime = dt / vehicle.speed;
            }
            case 3:
                speedSet = 150;
            {
                charge = (dt / bus.fuelEff) * 2000;
                if (dt / bus.fuelEff % bus.oilSize == 0)
                    oilCnt = (dt / bus.fuelEff) / bus.oilSize;
                else oilCnt = (dt / bus.fuelEff) / bus.oilSize + 1;
                driveTime = dt / bus.speed;
            }
        }
        System.out.printf("총 이동비용 : %d원\n", charge);
        System.out.printf("주유 횟수 : %d번\n", oilCnt);
        System.out.printf("총 주행 시간 : %.2f시간", driveTime);
    }
}