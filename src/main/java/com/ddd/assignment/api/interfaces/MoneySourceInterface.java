package com.ddd.assignment.api.interfaces;

import com.ddd.assignment.api.MoneySource;

public interface MoneySourceInterface {
    void credit(MoneySource moneySource, double amount);

    void debit(MoneySource MoneySource, double amount);

    MoneySource active();
}
