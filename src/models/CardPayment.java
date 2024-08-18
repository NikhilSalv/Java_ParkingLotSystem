package models;

import Interfaces.Payment;

public class CardPayment extends Payment {
    @Override
    public boolean initiateTransaction() {
        return false;
    }
}
