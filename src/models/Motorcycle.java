package models;

import Interfaces.ParkingSpot;

public class Motorcycle extends ParkingSpot {
    @Override
    public boolean getIsFree() {
        return false;
    }

    @Override
    public void setIsFree() {

    }
}
