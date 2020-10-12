package com.ddd.assignment.api.services;

import com.ddd.assignment.api.interfaces.*;

public abstract class TransactionAbstract implements TransactionInterface {
    private AccountInterface accountProvider;
    private FeeInterface feeProvider;
    private MoneySourceInterface moneySourceProvider;
}
