package ex26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        Assertions.assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(5000, 12, 100));
    }
}