package Interfaces;

import constants.PaymentStatus;

import java.util.Date;

public abstract class Payment {
    private double amount;
    private PaymentStatus paymentStatus;
    private Date date;
    private String transactionId;

    public abstract boolean initiateTransaction();

}
