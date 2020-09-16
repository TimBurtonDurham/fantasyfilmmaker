package com.ffm.bank;

public class BankAccount {

    private String accountnumber;

    private Integer currentbalance;

    public String getAccountnumber() {

        return accountnumber;
    }

    public BankAccount withAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;
        return this;
    }

    public Integer getCurrentbalance() {

        return currentbalance;
    }

    public BankAccount withCurrentbalance(Integer currentbalance) {

        this.currentbalance = currentbalance;
        return this;
    }

    @Override public String toString() {

        return String.format("accountnumber=%s,currentbalance=%s", accountnumber, currentbalance);
    }
}
