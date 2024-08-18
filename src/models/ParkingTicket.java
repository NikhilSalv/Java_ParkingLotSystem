package models;

import Interfaces.Vehicle;
import constants.PaymentStatus;
import constants.TicketStatus;

import java.sql.Time;
import java.util.Date;

public class ParkingTicket {

    private int ticketId;
    private Time entryTimestamp;
    private double amount;
    private Time exitTime;
    private PaymentStatus paymentStatus;
    private Payment payment;
    private Vehicle vehicleNumber;
    private TicketStatus ticketStatus;
    private Entrance entrance;
    private Exit exit;



}
