package models;

import Interfaces.ParkingSpot;

public class Compact extends ParkingSpot {
    @Override
    public boolean getIsFree() {
        return false;
    }

    @Override
    public void setIsFree() {

    }
}
