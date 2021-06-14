package ex29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
class AppTest {

    @Test
    void calculateYearsNeeded() {
        Assertions.assertEquals(18.0, App.calculateYearsNeeded(4.0));
    }
}