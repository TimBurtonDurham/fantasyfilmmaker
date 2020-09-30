package com.ffm.bank;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BankAccountRowMapper implements RowMapper<BankAccount> {
    @Override
    public BankAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
        BankAccount bankaccount = new BankAccount();

        bankaccount.setId(rs.getInt("id"));
        bankaccount.withAccountnumber(rs.getString("accountnumber"));
        bankaccount.withCurrentbalance(rs.getInt("currentbalance"));
        return bankaccount;
    }
}
