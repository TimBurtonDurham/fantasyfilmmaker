package com.ffm.bank;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service public class BankAccountService {

    public List<BankAccount> getBankAccounts() {

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount().withCurrentbalance(1000000).withAccountnumber("AC52459512"));
        return accounts;
    }

}
