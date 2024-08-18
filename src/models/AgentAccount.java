package models;

import Interfaces.Account;

public class AgentAccount extends Account {

    public boolean processTicket(ParkingTicket ticket){
        return false;
    };

    @Override
    public boolean resetPassword() {
        return false;
    }
}
