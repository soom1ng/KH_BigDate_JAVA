package Make_car;


public class Car {
        protected int fuelEff ;
        protected int speed;
        protected int oilSize;
        protected int seat;
        protected String name;
        protected boolean isOption;

        Car(String name){
            this.name = name;
        }
    }

    class SportsCar extends Car {
        SportsCar(String name) {
            super(name);
            speed = 250;
            fuelEff = 8;
            oilSize = 30;
            seat = 2;
            isOption = false;
        }
        void infoSportCar(){
            String onOffStr = (isOption) ? "ON" : "OFF";
            System.out.println("====== "+ name + " ======");
            System.out.println("속도 : " + speed);
            System.out.println("연비 : " + fuelEff);
            System.out.println("연료탱크 : " + oilSize  );
            System.out.println("좌석수 : " + seat);
            System.out.println("터보기능 : " + onOffStr);
        }

        int getSpeed(){ // Getter.
            if(isOption) return speed *= 1.2;
            return speed;
        }
        boolean getTurbo(){ // Getter.
            return isOption;
        }
        void setTurbo(boolean turbo){ // Setter 외부에서 내부에 있는 필드값을 변경
            isOption = turbo;
        }

    }
    class Vehicle extends Car {
        Vehicle(String name) {
            super(name);
            speed = 200;
            fuelEff = 12;
            oilSize = 45;
            seat = 4;
        }
        void infoVehicle(){
            String onOffStr = (isOption) ? "ON" : "OFF";
            System.out.println("====== "+ name + " ======");
            System.out.println("속도 : " + speed);
            System.out.println("연비 : " + fuelEff);
            System.out.println("연료탱크 : " + oilSize  );
            System.out.println("좌석수 : " + seat);
            System.out.println("트렁크 : " + isOption);
        }


        int getSeat(){ // Getter.
            if(isOption) return seat += 1;
            return seat;
        }
        boolean getTrunk(){ // Getter.
            return isOption;
        }
        void setTrunk(boolean trunk){ // Setter 외부에서 내부에 있는 필드값을 변경
            isOption = trunk;
        }

    }

    class Bus extends Car {

        Bus(String name) {
            super(name);
            speed = 150;
            fuelEff = 5;
            oilSize = 100;
            seat = 20;
        }
        void infoBus(){
            String onOffStr = (isOption) ? "ON" : "OFF";
            System.out.println("====== "+ name + " ======");
            System.out.println("속도 : " + speed);
            System.out.println("연비 : " + fuelEff);
            System.out.println("연료탱크 : " + oilSize  );
            System.out.println("좌석수 : " + seat);
            System.out.println("보조연료탱크 : " + onOffStr);
        }
        int getOilSize(){ // Getter.
            if(isOption) return oilSize += 30;
            return oilSize;
        }
        boolean getTank(){ // Getter.
            return isOption;
        }
        void setTank(boolean tank){ // Setter 외부에서 내부에 있는 필드값을 변경
            isOption = tank;
        }
    }

//    public void GetResult (int location, int manNum) {
//    int rst;
//    int drive;
//    int oilCnt;
//        rst = drive / fuelEff * 2000
//        System.out.println("이동의 필요한 총비용 : " +  rst);
//        if (( dt(400) / fuelEff(8) ) % oilSize == 0) oilCnt =  dt(400) / fuelEff(8) ) / oilSize;
//        else oilCnt =  ( dt(400) / fuelEff(8) ) / oilSize) + 1;
//        System.out.println("주유횟수 : " +  oilCnt );
//        System.out.printf("총시간 계산식 : %.2f 시간" , (double)( * drive) / speed);
//        }
//    }

