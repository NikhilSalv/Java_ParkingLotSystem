package Interfaces;

import constants.AccountStatus;
import models.Person;

public abstract  class Account {
    private String username;
    private String password;
    private AccountStatus status;
    private Person person;

    public abstract boolean resetPassword();
}
