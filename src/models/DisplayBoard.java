package models;

import Interfaces.ParkingSpot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayBoard {

    private int id;

    private Map<String, List<ParkingSpot>> parkingSpots;

    public DisplayBoard(int id){
        this.id = id;
        this.parkingSpots = new HashMap<>();
    };

    public void showFreeSpots(){

    }

    public boolean notifyParkingFull(){
        return false;
    };

    public void addParkingSlot(String spotType, List<ParkingSpot> spots){

    };



}
