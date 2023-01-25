package Make_car_Final;

public abstract class MakeCar { // 객체를 만들 필요가 없기 때문에 추상 클래스로 생성
    protected int speed;
    protected int fuelEff; // 연비
    protected int fuelTank; // 연료 탱크
    protected int seatCnt; // 좌석 수
    protected String name; // 자동차 이름

    // 부가 기능은 각 차량마다 다르기 때문에 부모는 기능만 명시하고 상속 받은 자식이 해당 기능을 구현 함 .
    public abstract void setMode(boolean isOption);

    public String getName() {
        return name;
    }
    // 이동 횟수 구하기 : 외부의 입력 값으로 승객의 수가 필요 함 .
    public int getMoveCnt(int passCnt) {
        if(passCnt % seatCnt != 0) return (passCnt / seatCnt) + 1;
        return passCnt / seatCnt;
    }

    // 총 이동 비용 : 매개변수로 거리와 이동 횟수가 필요 함 .
    public int getTotalCost(int dt, int moveCnt) {
        return (dt / fuelEff * 2000) * moveCnt;
    }

    // 총 주유 횟수 : 총 이동 거리를 구하고 이를 연비로 나눈 후, 다시 연료 탱크의 크기로 나눔 .
    public int getRefuelCnt(int dt, int moveCnt) {
        if(((dt * moveCnt) / fuelEff) % fuelTank != 0)
            return (((dt * moveCnt) / fuelEff) / fuelTank) + 1;
        return (((dt * moveCnt) / fuelEff) / fuelTank);
    }

    // 총 소요 시간
    public double getTotalTime(int dt, int moveCnt) {
        return (double) dt * moveCnt * speed;
    }

}


