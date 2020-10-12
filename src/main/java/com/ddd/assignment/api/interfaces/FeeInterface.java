package com.ddd.assignment.api.interfaces;

import com.ddd.assignment.api.Fee;
import com.ddd.assignment.api.Transaction;

public interface FeeInterface {
    Fee calculate(Transaction transaction);
}
