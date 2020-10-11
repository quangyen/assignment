package com.ddd.assignment;

public interface OcsBalanceInterface {
    void credit(OcsBalance ocsBalance, double amount);

    void debit(OcsBalance OcsBalance, double amount);

    OcsBalance active();
}
