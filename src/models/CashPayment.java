package models;

import Interfaces.Payment;

public class CashPayment extends Payment {
    @Override
    public boolean initiateTransaction() {
        return false;
    }
}
