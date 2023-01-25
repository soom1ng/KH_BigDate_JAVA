package Make_car_Final;

public class VehicleCar extends MakeCar {
    public VehicleCar(String name) {
        this.name = name;
        speed = 200;
        fuelEff = 12;
        fuelTank = 45;
        seatCnt = 4;
    }

    @Override
    public void setMode(boolean isOption) {
        if(isOption) seatCnt += 1;
    }
}
