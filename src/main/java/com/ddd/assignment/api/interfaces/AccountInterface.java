package com.ddd.assignment.api.interfaces;

import com.ddd.assignment.api.Account;

public interface AccountInterface {
    void getInfo(String msisdn);

    void create(Account account);
}
