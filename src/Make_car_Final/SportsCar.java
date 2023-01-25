package Make_car_Final;

import javax.swing.*;

public class SportsCar extends MakeCar {
    public SportsCar(String name) {
        this.name = name;
        speed = 250;
        fuelEff = 8;
        fuelTank = 30;
        seatCnt = 2;
    }
    @Override
    public void setMode(boolean isOption) {
        if (isOption) speed *= 1.2;
    }
}

