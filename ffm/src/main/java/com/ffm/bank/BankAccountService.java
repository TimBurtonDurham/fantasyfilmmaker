package com.ffm.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BankAccountService {

  @Autowired
  BankAccountDao bankaccountDao;

  public List<BankAccount> getBankAccounts() {

    return bankaccountDao.getAllBankAccounts();
  }
  public  BankAccount getBankAccountById(Integer id)  {
    return bankaccountDao.getBankAccount(id);
  }

}
