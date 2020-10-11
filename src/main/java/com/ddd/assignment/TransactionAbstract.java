package com.ddd.assignment;

public abstract class TransactionAbstract implements TransactionInterface{
    private AccountInterface accountProvider;
    private FeeInterface feeProvider;
    private OcsBalanceInterface ocsBalanceProvider;
    private BillInterface billProvider;
}
