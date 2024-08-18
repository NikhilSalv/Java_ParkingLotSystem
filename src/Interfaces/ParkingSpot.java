package Interfaces;

public  abstract class ParkingSpot {
    private int id;
    private boolean isFree;

    public abstract boolean getIsFree();

    public abstract void setIsFree();

}
