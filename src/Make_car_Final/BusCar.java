package Make_car_Final;

public class BusCar extends MakeCar {
    public BusCar(String name) {
        this.name = name;
        speed = 150;
        fuelEff = 5;
        fuelTank = 100;
        seatCnt = 20;
    }

    @Override
    public void setMode(boolean isOption) {
        if(isOption) fuelTank += 30;
    }
}
