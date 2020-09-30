package com.ffm.bank;

import com.ffm.bank.BankAccount;
import com.ffm.bank.BankAccountRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BankAccountDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<BankAccount> getAllBankAccounts() {
    return jdbcTemplate.query(String.format(
            "SELECT b. * " +
                    "FROM bank_account b " +
                    "WHERE b.DELETED=0;"), new BankAccountRowMapper());
  }
  public BankAccount getBankAccount(Integer bankaccountId) {
    return jdbcTemplate.queryForObject(String.format(
            "SELECT b. * " +
                    "FROM bank_account b " +
                    "WHERE b.DELETED=0 AND a.id="+bankaccountId+";"), new BankAccountRowMapper());
  }

  public void saveBankAccount(BankAccount bankaccount) {
    jdbcTemplate.execute("INSERT INTO bank_account values.......");

  }
}
