package com.ddd.assignment.api.services;

import com.ddd.assignment.api.interfaces.AccountInterface;
import com.ddd.assignment.api.interfaces.MoneySourceInterface;

public abstract class AccountAbstract implements AccountInterface {
    private MoneySourceInterface moneySourceProvider;
}
