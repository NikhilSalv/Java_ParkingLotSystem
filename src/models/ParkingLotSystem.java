package models;

import java.util.Map;

public class ParkingLotSystem {

    private String id;
    private String name;
    private String address;

    private Map<String, Entrance> entranceMap;
    private Map<String, Exit> exitMap;
    private Map<String, DisplayBoard> displayBoardMap;
    private Map<String, ParkingTicket> parkingTicketMap;

    private ParkingLotSystem(){};

    private static ParkingLotSystem parkingLotSystem = null;

    public ParkingLotSystem getInstance() {
        if(parkingLotSystem == null){
            parkingLotSystem = new ParkingLotSystem();
        }
        return parkingLotSystem;
    }
}
