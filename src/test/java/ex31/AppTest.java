package ex31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
class AppTest {

    @Test
    void calculateTargetHeartRate() {
        Assertions.assertEquals(138, Math.floor(App.calculateTargetHeartRate(65,22, .55)));
        Assertions.assertEquals(191, Math.floor(App.calculateTargetHeartRate(65,22, .95)));
    }
}