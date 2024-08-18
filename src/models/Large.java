package models;

import Interfaces.ParkingSpot;

public class Large extends ParkingSpot {
    @Override
    public boolean getIsFree() {
        return false;
    }

    @Override
    public void setIsFree() {

    }
}
