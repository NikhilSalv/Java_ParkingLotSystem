package models;

import Interfaces.Account;
import Interfaces.ParkingSpot;

public class AdminAccount extends Account {

    public void addParkingSpot(ParkingSpot parkingSpot){

    };

    public void addEntrance(Entrance entrance){

    };

    public void addExit(Exit exit){

    };

    public void addDisplayBoard(DisplayBoard display){

    };

    public void removeParkingSpot(){};

    @Override
    public boolean resetPassword() {
        return false;

    }
}
